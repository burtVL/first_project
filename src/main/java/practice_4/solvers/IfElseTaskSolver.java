package practice_4.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // Проверка метода четности

        System.out.println(checkParity(4));
        System.out.println(checkParity(7));

        // Проверка метода определения возраста

        System.out.println(checkAge(6));
        System.out.println(checkAge(19));
        System.out.println(checkAge(65));

        // Проверка метода по нахождению max среди трех чисел

        System.out.println(checkMax(3,7,5));
    }

    /**
     * Метод для проверки четности числа number
     * @param number
     * @return
     */

    public static String checkParity(int number) {
        // if - else
        // number % 2 == 0 - так проверяется является ли число четным. (при делении % на 2 получаем 0)
        // number % 2 == 1 - нечетное
        // number = 2; -> 2 % 2 == 0 -> четное
        // number = 7; -> 7 % 2 == 1 -> нечетное (остаток при делении на 2, будет 1, то есть без остатка мы можем поделить 6 % 2 и остается 1)
        // в методе должен быть один return

        String parity = "нечетное";

        if (number % 2 == 0) {
            parity = "четное";
        }

        return parity;

    }

    public static String checkAge(int age) {
        String ageDiscription = "";
        if (age < 18) {
            ageDiscription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDiscription = "Взрослый";
        }
        if (age > 60) {
            ageDiscription = "Пожилой";
        }
        return ageDiscription;
    }


    public static int checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;
    }
}
