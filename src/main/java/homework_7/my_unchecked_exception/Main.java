package homework_7.my_unchecked_exception;

public class Main {
    public static void main(String[] args) {

        try {
            EmailValidator.validateEmail("test@gmail.com");
            EmailValidator.validateEmail("invalid.email.com");
        } catch (WrongEmailException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
