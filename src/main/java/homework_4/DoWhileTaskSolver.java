package homework_4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        //task1(scanner);

        // Задание 2
        //task2(scanner);

        // Задание 3
       // task3();

        // Задание 4
        //task4(scanner);

        // Задание 5
        task5(scanner);
    }

    public static void task1(Scanner scanner) {
        int number;

        do {
            System.out.println("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Вы ввели положительное число: " + number);
    }

    public static void task2(Scanner scanner) {
        String correctPassword = "qwerty123";
        String userInput;

        do {
            System.out.print("Введите пароль: ");
            userInput = scanner.next();

        } while (!userInput.equals(correctPassword));
        System.out.println("Пароль верный! Доступ разрешен");
    }

    public static void task3() {
        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }

    public static void task4(Scanner scanner) {

        String userInput;

        do {
            System.out.print("Введите команду (или exit для выхода): ");
            userInput = scanner.next();
        } while (!userInput.equals("exit"));
        System.out.println("Программа завершена.");
    }

    public static void task5(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;
        int tempNumber = number;

        do {
            tempNumber = tempNumber / 10;
            count++;
        } while (tempNumber != 0);
        System.out.println("Количество цифр в числе " + number + " равно " + count);

    }
}
