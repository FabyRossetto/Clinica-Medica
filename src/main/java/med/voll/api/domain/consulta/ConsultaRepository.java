package med.voll.api.domain.consulta;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {


    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Consulta c WHERE c.paciente.id = :idPaciente AND c.fecha BETWEEN :primerHorario AND :ultimoHorario")
    Boolean existsByPacienteIdAndFechaBetween(
        @Param("idPaciente") Long idPaciente,
        @Param("primerHorario") LocalDateTime primerHorario,
        @Param("ultimoHorario") LocalDateTime ultimoHorario
    );

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Consulta c WHERE c.medico.id = :idMedico AND c.fecha = :fecha")
    Boolean existsByMedicoIdAndFecha(
        @Param("idMedico") Long idMedico,
        @Param("fecha") LocalDateTime fecha
    );
}

