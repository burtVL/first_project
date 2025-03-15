package homework_3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return  2 * Math.PI * radius;
    }
}
