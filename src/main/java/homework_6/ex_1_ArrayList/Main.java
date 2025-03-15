package homework_6.ex_1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,4,7,8,5));

        System.out.println("Массив из 5 чсиел: " + numbers);

        numbers.add(11);
        System.out.println();

        System.out.println("Массив из 6 чисел: " + numbers);
        System.out.println();

        //Задание 2

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(12);
        evenNumbers.add(3);
        evenNumbers.add(7);
        evenNumbers.add(4);
        evenNumbers.add(9);

        System.out.println(evenNumbers);
        System.out.println();

        System.out.println("Четные числа:");
        for (int number : evenNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        //Задание 3
        ArrayList<String> words = new ArrayList<>(List.of("привет!", "Привет мир!", "Привет Мир и пока", "Привет Мир и пока Мир"));

        System.out.println("Самая длинная строка: " + findLongString(words));
        System.out.println();

        //Задание 4
        ArrayList<Integer> numbers1 = new ArrayList<>(List.of(23,56,37,63,5));

        System.out.println("Сумма всех чисел массива: " + sumOfNumbers(numbers1));
        System.out.println();

        // Задание 5
        ArrayList<Integer> numbers2 = new ArrayList<>(List.of(242,436,3577,463,85));
        System.out.println("Максимальное число массива: " + maxOfNumbers(numbers2));


    }

    public static boolean removeNumbers(Integer n) {
        return n % 2 == 0;
    }

    public static String findLongString(ArrayList<String> strings) {
        String longString = strings.get(0);

        for (int i = 1; i < strings.size(); i++) {
            String currenString = strings.get(i);

            if (currenString.length() > longString.length()) {
                longString = currenString;
            }
        }
        return longString;
    }

    public static int sumOfNumbers(ArrayList<Integer> integers) {
        int sum = 0;

        for (int i = 0; i < integers.size(); i++ ) {
            sum = sum + integers.get(i);
        }
        return sum;
    }

    public static int maxOfNumbers(ArrayList<Integer> integers) {
        int maxNumber = integers.get(0);

        for (int i = 0; i < integers.size(); i++) {
            int currentNumber = integers.get(i);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        return maxNumber;
    }
}


