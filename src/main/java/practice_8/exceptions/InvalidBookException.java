package practice_8.exceptions;

// не проверяемое исключение: наследуется от  RunTimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}
