package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // проверка метода по выводу всех чисел от 1 до 10
        //printAllNumberBefore10();

        // проверка метода по считыванию команд с консоли, пока не введут exit
        //commandReader();

        // проверка метода по подсчету сумм цивр в числе
        System.out.println(sumOfDigits(123));
    }

    public static void printAllNumberBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }

        System.out.println("Команда завершена.");
    }

    public static int sumOfDigits(int number) {
        // number = 123, 1 + 2 + 3
        // остаток от деления на 10: 123 % 10 = 3
        // 123 / 10 = 12
        // остаток от деления на 10: 12 % 10 = 2
        // 12 / 10 = 1
        // остаток от деления на 10: 1 % 10 = 1
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;

    }
}
