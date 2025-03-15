package homework_4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
       // task1();

        // Задание 2
        //task2(scanner);

        // Задание 3
        //task3(scanner);

        // Задание 4
       // task4(scanner);

        //Задание 5
        task5();
    }

    public static void task1() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void task2(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел от 1 до " + n + " равна " + sum);
    }

    public static void task3(Scanner scanner) {
        System.out.println("Введите число для таблицы умножения: ");

        int num = scanner.nextInt();
        System.out.println("Таблица умножения для числа " + num + ":");

        for (int i = 1; i <= 100; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void task4(Scanner scanner) {
        System.out.print("Введите число для проверки: ");

        int checkSimple = scanner.nextInt();

        boolean isSimple = true;
        for (int i = 2; i <= Math.sqrt(checkSimple); i++){
            if (checkSimple % i == 0) {
                isSimple = false;
                break;
            }
        }
        if (checkSimple < 2) {
            isSimple = false;
        }
        System.out.println(checkSimple + (isSimple ?" - Простое": "- Не простое"));

    }

    public static void task5() {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}


