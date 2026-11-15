package cl.volvo.carritoservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarritoResponseDTO {
    private Long id;
    private Long usuarioId;
    private List<ItemCarritoResponseDTO> items;
    private Integer totalItems;
    private Integer total;
    private LocalDateTime fechaActualizacion;
}
