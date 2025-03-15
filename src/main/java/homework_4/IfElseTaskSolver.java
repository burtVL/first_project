package homework_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        //task1(scanner);

        // Задание 2
        //task2(scanner);

        // Задание 3
        //task3(scanner);

        // Задание 4
        //task4(scanner);

        // Задание 5
        //task5(scanner);

        //Задание 6
        task6(scanner);
    }

        public static void task1(Scanner scanner) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Число положительное");
            } else if (number < 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Число равно нулю");
            }
        }

        public static void task2(Scanner scanner) {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();

            if(number1 > number2) {
                System.out.println("Наибольшее число: " + number1);
            } else if (number2 > number1) {
                System.out.println("Наибольшее число: " + number2);

            } else {
                System.out.println("Числа равны");
            }

        }

        public static void task3(Scanner scanner) {
            System.out.print("Ввведиет оценку от (1-5): ");

            int grade = scanner.nextInt();

            if (grade == 5) {
                System.out.println("5 — \"Отлично\"");
            } else if (grade == 4) {
                System.out.println("4 — \"Хорошо\"");
            } else if (grade == 3) {
                System.out.println("3 — \"Удовлетворительно\"");
            } else if (grade == 2 || grade == 1) {
                System.out.println("2 или 1 — \"Неудовлетворительно\"");
            } else {
                System.out.println("Некорректная оценка");
            }

        }

        public static void task4(Scanner scanner) {
            System.out.print("Ведите число для проверки четности: ");

            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " является четным числом.");
            } else {
                System.out.println(number + " является не четным числом.");
            }
        }

        public static void task5(Scanner scanner) {
            System.out.print("Введите ваш возраст: ");

            int age = scanner.nextInt();

            if (age <= 18) {
                System.out.println("Вы получаете скидку 25%.");
            } else if (age >= 65) {
                System.out.println("Вы получаете скидку 30%");
            } else {
                System.out.println("Скидка не предусмотрена");
            }
        }

        public static void task6(Scanner scanner) {
            System.out.print("Введите количество баллов за выполенный тест: ");
            int score = scanner.nextInt();

            if (score >= 90) {
                System.out.println("Ваша результат более 90 баллов - оценка Отлично.");
            } else if (score >= 75) {
                System.out.println("Ваша результат  от 75 до 89 баллов - оценка Хорошо.");
            } else if (score >= 60) {
                System.out.println("Ваша результат  от 60 до 74 баллов - оценка Удовлетворительно.");
            } else {
                System.out.println("Ваша результат ниже 60 баллов - оценка Неудовлетворительно.");
            }
        }
}
