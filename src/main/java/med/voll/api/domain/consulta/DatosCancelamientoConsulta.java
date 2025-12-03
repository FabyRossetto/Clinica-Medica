/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package med.voll.api.domain.consulta;
import jakarta.validation.constraints.NotNull;

public record DatosCancelamientoConsulta(
        @NotNull Long idConsulta,
        @NotNull MotivoCancelamiento motivo) {
}

