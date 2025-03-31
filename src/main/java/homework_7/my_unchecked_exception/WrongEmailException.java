package homework_7.my_unchecked_exception;

public class WrongEmailException extends RuntimeException {
  public WrongEmailException(String message) {
    super(message);
  }
}
