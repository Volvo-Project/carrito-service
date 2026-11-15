package cl.volvo.carritoservice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgregarItemRequestDTO {

    @NotNull(message = "EL ID DEL PRODUCTO ES OBLIGATORIO")
    @Positive(message = "EL ID DEL PRODUCTO DEBE SER MAYOR A CERO")
    private Long productoId;

    @NotNull(message = "LA CANTIDAD ES OBLIGATORIA")
    @Min(value = 1, message = "LA CANTIDAD MINIMA ES 1")
    private Integer cantidad;
}
