package homework_7.checked_unchecked_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1 Обработка проверяемого исключения
        /*
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }

        System.out.println();*/

        // Задание 2
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int firstDividenumber = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int secondDividenumber = scanner.nextInt();

            int divide = firstDividenumber / secondDividenumber;
            System.out.println("Результат деления: " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно");
        }
    }
}
