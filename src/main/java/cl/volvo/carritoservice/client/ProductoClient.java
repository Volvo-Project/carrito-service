package cl.volvo.carritoservice.client;

import cl.volvo.carritoservice.dto.ProductoDTO;
import cl.volvo.carritoservice.exception.RecursoNoEncontradoException;
import cl.volvo.carritoservice.exception.ServicioNoDisponibleException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClient;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProductoClient {

    private final RestClient productoRestClient;

    public ProductoDTO obtenerProducto(Long productoId) {
        try {
            return productoRestClient.get()
                    .uri("/api/v1/productos/{id}", productoId)
                    .retrieve()
                    .body(ProductoDTO.class);

        } catch (HttpClientErrorException.NotFound ex) {
            throw new RecursoNoEncontradoException("Producto", productoId);

        } catch (ResourceAccessException ex) {
            log.error("NO SE PUDO CONECTAR CON PRODUCTO-SERVICE: {}", ex.getMessage());
            throw new ServicioNoDisponibleException("El catálogo no está disponible, intente más tarde");
        }
    }
}