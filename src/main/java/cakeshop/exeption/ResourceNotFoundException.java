package cakeshop.exeption;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ResourceNotFoundException(String recurso, Long id) {
        super(String.format("%s com ID %d não encontrado", recurso, id));
    }
}

