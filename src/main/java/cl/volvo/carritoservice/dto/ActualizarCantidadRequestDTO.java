package cl.volvo.carritoservice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActualizarCantidadRequestDTO {

    @NotNull(message = "LA CANTIDAD ES OBLIGATORIA")
    @Min(value = 1, message = "LA CANTIDAD MINIMA ES 1")
    private Integer cantidad;
}
