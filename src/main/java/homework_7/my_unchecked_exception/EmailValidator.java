package homework_7.my_unchecked_exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void validateEmail(String email) {
        final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new WrongEmailException("Некорректный email: " + email);
        }
        System.out.println("Email корректен: " + email);
    }
}
