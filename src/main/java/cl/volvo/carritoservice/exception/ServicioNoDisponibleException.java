package cl.volvo.carritoservice.exception;


public class ServicioNoDisponibleException extends RuntimeException{
    public ServicioNoDisponibleException(String mensaje){
        super (mensaje);
    }
}
