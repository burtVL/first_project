package homework_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задание 1
       // task1(scanner);

        //Задание 2
        //task2();

        // Задание 3
        //task3(scanner);

        // Задание 4
        task4(scanner);
    }

    public static void task1(Scanner scanner) {
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("Сумма введенных чисел: " + sum);
    }

    public static void task2() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i + " ");
        }

    }

    public static void task3(Scanner scanner) {

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            System.out.println("Положительное число " + number);
        }
    }

    public static void task4(Scanner scanner) {

        while (true) {
            System.out.print("Введите команду: ");
            String input = scanner.nextLine();

            if (input.equals("stop")){
                break;
            }
            System.out.println("Вы ввели команду: " + input);
        }
    }
}
