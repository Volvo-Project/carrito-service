package cl.volvo.carritoservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carritos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long usuarioId;

    @Column(nullable = false)
    private LocalDateTime fechaActualizacion;

    @OneToMany(mappedBy = "carrito", cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ItemCarrito> items = new ArrayList<>();



}
