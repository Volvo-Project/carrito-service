package cl.volvo.carritoservice.exception;

import java.util.Locale;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(String nombreProducto, Integer disponible,
                                      Integer solicitado) {
        super("STOCK INSUFICIENTE PARA: " + nombreProducto.toUpperCase() + ", DISPONIBLE: " +
                disponible + ", SOLICITADO: " + solicitado);
    }
}
