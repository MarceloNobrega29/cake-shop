package cakeshop.exeption;

public class InvalidOperationException extends RuntimeException {
    public InvalidOperationException(String mensagem) {
        super(mensagem);
    }

}
