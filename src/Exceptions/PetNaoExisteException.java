package Exceptions;

public class PetNaoExisteException extends Exception {
    public PetNaoExisteException(String message) {
            super(message);
        }
}
