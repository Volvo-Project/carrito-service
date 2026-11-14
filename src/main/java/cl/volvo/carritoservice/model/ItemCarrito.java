package cl.volvo.carritoservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items_carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Carrito carrito;

    @Column(nullable = false)
    private Long productoId;

    @Column(nullable = false)
    private String nombreProducto;

    @Column(nullable = false)
    private Integer precioUnitario;

    @Column(nullable = false)
    private Integer cantidad;



}
