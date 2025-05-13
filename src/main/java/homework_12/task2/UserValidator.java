package homework_12.task2;

import java.util.regex.Pattern;

public class UserValidator {
    private static boolean validationEnabled = true;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void setValidationEnabled(boolean enabled) {
        validationEnabled = enabled;
    }

    public static void validate(User user) {
        if (!validationEnabled) {
            return;
        }

        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());

    }

    private static void validateName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserException("Поле Имя не может быть пустым");
        }

        if (Character.isLowerCase(name.charAt(0))){
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        }
    }

    private static void validateAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть от 18 до 100 лет");
        }
    }

    private static void validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidUserException("Email не должен быть пустым");
        }

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidUserException("Некорректный формат email");
        }
    }

}
