package med.voll.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import med.voll.api.domain.paciente.*;
import med.voll.api.infra.errores.TratadorDeErrores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/pacientes")
@SecurityRequirement(name = "bearer-key")
@SuppressWarnings("all")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
@Transactional
@Operation(summary = "Registra un nuevo paciente")
public ResponseEntity registrar(@RequestBody @Valid DatosRegistroPaciente datos, UriComponentsBuilder uriBuilder) {
    try {
        var paciente = new Paciente(datos);
        repository.save(paciente);
        
        var uri = uriBuilder.path("/pacientes/{id}").buildAndExpand(paciente.getId()).toUri();
        return ResponseEntity.created(uri).body(new DatosDetallesPaciente(paciente));

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
    @Operation(summary = "Obtiene el listado para los pacientes")
    public ResponseEntity<Page<DatosListaPaciente>> listar(@PageableDefault(size = 20) Pageable paginacion) {
        var page = repository.findAllByActivoTrue(paginacion).map(DatosListaPaciente::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    @Operation(summary = "Actualiza las informaciones para el paciente")
    public ResponseEntity actualizar(@RequestBody @Valid DatosActualizacionPaciente datos) {
        var paciente = repository.getReferenceById(datos.id());
        paciente.actualizarInformacoes(datos);

        return ResponseEntity.ok(new DatosDetallesPaciente(paciente));
    }

    @DeleteMapping("/{id}")
    @Transactional
    @Operation(summary = "Elimina un paciente a partir del ID")
    public ResponseEntity eliminar(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.eliminar();

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "obtiene los detalles para el paciente con el ID indicado")
    public ResponseEntity detallar(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        if (paciente.getActivo() == true) {
            return ResponseEntity.ok(new DatosDetallesPaciente(paciente));
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
