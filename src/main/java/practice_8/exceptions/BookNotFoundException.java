package practice_8.exceptions;

// проверяемое исключение, наследует от Exception (или от наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
