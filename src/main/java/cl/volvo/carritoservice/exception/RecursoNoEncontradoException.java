package cl.volvo.carritoservice.exception;

public class RecursoNoEncontradoException extends RuntimeException{
    public RecursoNoEncontradoException(String recurso, Long id) {

        super(recurso.toUpperCase() + " CON EL ID " + id + " NO ENCONTRADO");
    }
}
