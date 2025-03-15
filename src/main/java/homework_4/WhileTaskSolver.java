package homework_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
       // task1(scanner);

        // Задание 2
        //task2(scanner);

        // Задание 3
        task3(scanner);
    }

    public static void task1(Scanner scanner) {
        System.out.print("Введите число для вычисления факториала: ");

        int number = scanner.nextInt();
        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static void task2(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }

    public static void task3(Scanner scanner) {
        System.out.print("Введите положительное число для вывода обратного отчета: ");

        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.print(number + " ");
            number--;
        }
    }
}