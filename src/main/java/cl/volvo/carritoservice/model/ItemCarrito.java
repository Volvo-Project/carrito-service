package cl.volvo.carritoservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items_carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "carrito_id", nullable = false)
    private Carrito carrito;

    @Column(nullable = false)
    private Long productoId;

    @Column(nullable = false, length = 100)
    private String nombreProducto;

    @Column(nullable = false)
    private Integer precioUnitario;

    @Column(nullable = false)
    private Integer cantidad;


}
