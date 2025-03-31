package homework_7.my_checked_exception;

public class User {
    public int checkAge(Integer age) throws ValidAgeUserException {
        if (age <= 0 || age >= 150) {
            throw new ValidAgeUserException("Ваш возраст не валиден: " + age + " лет");
        }
        System.out.println("Ваш возраст: " + age + " лет");
        return age;
    }
}
