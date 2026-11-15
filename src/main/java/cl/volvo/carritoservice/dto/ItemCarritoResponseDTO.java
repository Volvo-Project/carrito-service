package cl.volvo.carritoservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCarritoResponseDTO {

    private Long productoId;
    private String nombreProducto;
    private Integer precioUnitario;
    private Integer cantidad;
    private Integer subtotal;
}
