package homework_7.my_checked_exception;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.checkAge(50);
            user.checkAge(-1);
        } catch (ValidAgeUserException e) {
            System.out.println(e.getMessage());
        }
    }
}
