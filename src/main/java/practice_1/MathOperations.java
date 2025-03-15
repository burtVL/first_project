package practice_1;


public class MathOperations {

        public static int add(int x, int y) {
            return x + y;
        }
        public static int subtract(int x, int y) {
            return x - y;
        }

        public static int multiply(int x, int y) {
            return x * y;
        }

        public static int divide(int x, int y) {
            return x / y;
        }

        public static int findMax(int a, int b) {
            return Math.max(a, b);
        }

        public static int difference(int x, int y) {
            return Math.abs(x - y);

        }

        public static int squareArea(int side) {
            return side * side;
        }

        public static int squarePerimeter(int side) {
            return 4 * side;
        }

        public static int convertSecondsToMinutes(int seconds) {
            return seconds / 60;
        }

        public static double averageSpeed(double distance, double time) {
            return distance / time;
        }

        public static double findHypotenuse(double a, double b) {
            return Math.sqrt(a * a + b * b);
        }

        public static double circleCircumference(double radius) {
            return 2 * Math.PI * radius;
        }

        public static double calculatePercentage(double total, double part) {
            return (part / total) * 100;
        }

        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

    public static void main(String[] args) {

            int add1 = add(34,54);
        System.out.println("Результат сложения: " + add1);

        int subctract1 = subtract(67, 45);
        System.out.println("Разность двух чисел: " + subctract1);

        int multiply1 = multiply(23, 8);
        System.out.println("Результат произведения двух чисел: " + multiply1);

        int divide1 = divide(36, 6);
        System.out.println("Результат деления двух чисел: " + divide1);

        int mathMax1 = findMax(5678, 7843);
        System.out.println("Результат нахождения максимума двух чисел: " + mathMax1);

        int difference1 = difference(15059, 23004);
        int difference2 = difference(1576789, 457784);
        System.out.println("Разница между двумя числами: " + difference1);
        System.out.println("Разница между двумя числами: " + difference2);

        int squareArea1 = squareArea(50);
        System.out.println("Площадь квадрата: " + squareArea1);

        int squarePerimeter1 = squarePerimeter(78);
        System.out.println("Периметр квадрата: " + squarePerimeter1);

        int convertSecondsToMinutes1 = convertSecondsToMinutes(3600);
        System.out.println("Результат перевода секунд в минуты: " + convertSecondsToMinutes1);

        double averageSpeed1 = averageSpeed(10.5, 0.9333);
        System.out.println("Средняя скорость: " + averageSpeed1 + " км/ч");

        double findHypotenuse1 = findHypotenuse(23.5, 656.43);
        System.out.println("Результат гепотенузы прямоугольного треугольника: " + findHypotenuse1);

        double circleCircumference1 = circleCircumference(35.43434);
        double circleCircumference2 = circleCircumference(20.5);
        System.out.println("Длина окружности: " + circleCircumference1);
        System.out.println("Длина окружности: " + circleCircumference2);

        double calculatePercentage1 = calculatePercentage(345.6, 56.7);
        System.out.println("Процент от общего: " + calculatePercentage1);

        double celsiusToFahrenheit1 = celsiusToFahrenheit(32.5);
        double celsiusToFahrenheit2 = celsiusToFahrenheit(-52.3);
        System.out.println("Перевод градусов из Цельсия в Фаренгейты: " + celsiusToFahrenheit1);
        System.out.println("Перевод градусов из Цельсия в Фаренгейты: " + celsiusToFahrenheit2);

        double fahrenheitToCelsius1 = fahrenheitToCelsius(90.5);
        double fahrenheitToCelsius2 = fahrenheitToCelsius(-123.4);
        System.out.println("Перевод градусов из Фаренгейта в Цельсии: " + fahrenheitToCelsius1);
        System.out.println("Перевод градусов из Фаренгейта в Цельсии: " + fahrenheitToCelsius2);

    }
}
