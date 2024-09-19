package med.voll.api.domain.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccion(
        @NotBlank
        String calle,
        @NotBlank
        String numero,
        @NotBlank
        String ciudad,
        @NotBlank
        String provincia,
        @NotBlank
        String pais) {
}
