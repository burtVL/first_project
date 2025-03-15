package homework_4;

import java.util.Locale;
import java.util.Scanner;

public class SwithTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задание 1
        //task1(scanner);

        // Задание 2
        //task2(scanner);

        // Задание 3
        //task3(scanner);

        // Задание 4
        //task4(scanner);

        // Задание 5
        task5(scanner);
    }

    public static void task1(Scanner scanner) {
        System.out.print("Введите день недели (число от 1 до 7): ");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Не верное число. Введите число от 1 до 7.");
        }

    }

    public static void task2(Scanner scanner) {
        System.out.print("Введите день недели (от 1 -7) в который вы хотите пойти в кино: ");

        int day = scanner.nextInt();

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Стоимость билета на сеанс: 300 рублей.");
                break;
            case 6: case 7:
                System.out.println("Стоимость билета на сеанс: 450 рублей.");
                break;
            default:
                System.out.println("Не верное число. Введите число от 1 до 7.");
        }
    }

    public static void task3(Scanner scanner) {
        System.out.print("Введите вашу оценку от 0 до 100: ");

        int score = scanner.nextInt();

        switch (score / 10) {
            case 10: case 9:
                System.out.println("Оценка: А");
                break;
            case 8:
                System.out.println("Оценка B");
                break;
            case 7:
                System.out.println("Оценка C");
                break;
            case 6:
                System.out.println("Оценка D");
                break;
            default:
                System.out.println("Оценка F");
        }
    }

    public static void task4(Scanner scanner) {
        System.out.print("Введите команду (\"start\", \"stop\", \"restart\", \"status\"): ");

        String command = scanner.next();

        switch (command.toLowerCase()) {
            case "start":
                System.out.println("Команда start выполнена");
                break;
            case "stop":
                System.out.println("Команда stop выполнена");
                break;
            case "restart":
                System.out.println("Команда restart выполнена");
                break;
            case "status":
                System.out.println("Команда status выполнена");
                break;
            default:
                System.out.println("Неверная команда");
        }
    }

    public static void task5(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Недопустимый оператор");

        }
    }

}



