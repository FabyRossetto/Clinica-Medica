package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.direccion.DatosDireccion;
import med.voll.api.domain.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import org.springframework.dao.DataIntegrityViolationException;

@RestController
@RequestMapping("/medicos")
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearer-key")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    @Operation(summary = "Registra un nuevo medico en la base de datos")
    public ResponseEntity registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico,
            UriComponentsBuilder uriComponentsBuilder) {
        try {
            Medico medico = medicoRepository.save(new Medico(datosRegistroMedico)); // <--- Aquí salta el error

            DatosRespuestaMedico datosRespuestaMedico = new DatosRespuestaMedico(
                    medico.getId(), medico.getNombre(), medico.getEmail(),
                    medico.getTelefono(), medico.getDocumento(),
                    new DatosDireccion(medico.getDireccion().getCalle(), medico.getDireccion().getNumero(),
                            medico.getDireccion().getCiudad(), medico.getDireccion().getProvincia(),
                            medico.getDireccion().getPais()));

            URI url = uriComponentsBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
            return ResponseEntity.created(url).body(datosRespuestaMedico);

        } catch (DataIntegrityViolationException e) {
            // Obtenemos el mensaje técnico de error
            String mensajeTecnico = e.getMostSpecificCause().getMessage();

            // Verificamos si el mensaje técnico menciona la columna 'documento' o 'email'
            if (mensajeTecnico.contains("documento") || mensajeTecnico.contains("dni")) {
                return ResponseEntity.badRequest().body("Error: Ya existe un paciente con ese Documento.");
            }
            if (mensajeTecnico.contains("email") || mensajeTecnico.contains("correo")) {
                return ResponseEntity.badRequest().body("Error: Ya existe un paciente con ese Email.");
            }

            // Mensaje por defecto si es otro error de duplicado
            return ResponseEntity.badRequest().body("Error: Datos duplicados (DNI o Email ya registrados).");
        }
    }

    @GetMapping
    @Operation(summary = "Obtiene el listado de medicos")
    public ResponseEntity<Page<DatosListadoMedico>> listadoMedicos(@PageableDefault(size = 20) Pageable paginacion) {
//        return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
        return ResponseEntity.ok(medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new));
    }

    @PutMapping
    @Transactional
    @Operation(summary = "Actualiza los datos de un medico existente")
    public ResponseEntity actualizarMedico(@RequestBody @Valid DatosActualizarMedico datosActualizarMedico) {
        try {
            // 1. Buscamos el médico por ID
            Medico medico = medicoRepository.getReferenceById(datosActualizarMedico.id());

            // 2. Actualizamos los datos (Nombre, Documento, Dirección)
            medico.actualizarDatos(datosActualizarMedico);

            // 3. ¡IMPORTANTE! Forzamos el guardado inmediato. 
            // Si el documento ya existe en otro médico, aquí saltará la excepción.
            medicoRepository.flush();

            // 4. Retornamos la respuesta correcta y ordenada
            return ResponseEntity.ok(new DatosRespuestaMedico(
                    medico.getId(),
                    medico.getNombre(),
                    medico.getEmail(),
                    medico.getTelefono(),
                    medico.getDocumento(), 
                    new DatosDireccion(
                            medico.getDireccion().getCalle(),
                            medico.getDireccion().getNumero(),
                            medico.getDireccion().getCiudad(),
                            medico.getDireccion().getProvincia(),
                            medico.getDireccion().getPais()
                    )
            ));

        } catch (DataIntegrityViolationException e) {
            // 5. Manejo de excepciones para mostrar mensaje claro en el SweetAlert
            String mensajeTecnico = e.getMostSpecificCause().getMessage();

            if (mensajeTecnico.contains("documento") || mensajeTecnico.contains("dni")) {
                return ResponseEntity.badRequest().body("Error: El documento ya pertenece a otro médico.");
            }
            if (mensajeTecnico.contains("email") || mensajeTecnico.contains("correo")) {
                return ResponseEntity.badRequest().body("Error: El email ya está registrado.");
            }
            return ResponseEntity.badRequest().body("Error: Datos duplicados (DNI o Email).");

        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE LOGICO
//    @DeleteMapping("/{id}")
//    @Transactional
//    @Operation(summary = "Elimina un medico registrado - inactivo")
//    public ResponseEntity eliminarMedico(@PathVariable Long id) {
//        Medico medico = medicoRepository.getReferenceById(id);
//        medico.desactivarMedico();
//        return ResponseEntity.noContent().build();
//    }
    // DELETE
    @DeleteMapping("/{id}")
    @Transactional
    @Operation(summary = "Elimina de la base de datos un medico registrado")
    public ResponseEntity eliminarMedico(@PathVariable Long id) {
        medicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtiene los registros del medico con ID")
    public ResponseEntity<DatosRespuestaMedico> retornaDatosMedico(@PathVariable Long id) {
        Medico medico = medicoRepository.getReferenceById(id);
        var datosMedico = new DatosRespuestaMedico(medico.getId(), medico.getNombre(), medico.getEmail(),
                medico.getTelefono(), medico.getEspecialidad().toString(),
                new DatosDireccion(medico.getDireccion().getCalle(), medico.getDireccion().getNumero(),
                        medico.getDireccion().getCiudad(), medico.getDireccion().getProvincia(),
                        medico.getDireccion().getPais()));
        return ResponseEntity.ok(datosMedico);
    }

}
