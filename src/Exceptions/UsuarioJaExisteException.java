package Exceptions;

public class UsuarioJaExisteException extends Exception {
    public UsuarioJaExisteException(String message) {
        super(message);
    }
}
