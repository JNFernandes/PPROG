package exception;

public class MesInvalidoException extends ArrayIndexOutOfBoundsException {

    public MesInvalidoException() {super("argumento invalido");}

    public MesInvalidoException(String message) {super(message);}

}
