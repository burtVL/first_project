package homework_11;

public class DebugTask4 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {
        if (str == null) {
            System.out.println("Ошибка, Null передавать нельзя");
            return false;
        } else {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }

    }
}
