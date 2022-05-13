package exception;

public class DiaInvalidoException extends ArrayIndexOutOfBoundsException {

    public DiaInvalidoException() {super("argumento invalido");}

    public DiaInvalidoException(String message) {super(message);}
}

