package cakeshop.exeption;

public class ExcelException extends RuntimeException{

    public ExcelException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public ExcelException(String mensagem) {
        super(mensagem);
    }

}
