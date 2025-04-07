package homework_8.part_2_stream_api_base_operation.ex_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Фильтрация строк по длине больше 5

        List<String> brandList = Arrays.asList("Toyota", "Kia", "Nissan", "Mitsubishi");
        List<String> filtred = brandList.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Отсортированный строки по длине: " + filtred);
        System.out.println();

        //Задание 2 Фильтрация чисел, кратных 5

        List<Integer> numbers = Arrays.asList(25, 34, 5, 6, 40);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println("Числа кратные 5: " + filteredNumbers);
        System.out.println();

        //Задание 3 Преобразование строк в их длины

        List<String> animalList = Arrays.asList("Кит", "Панда", "Косатка", "Змея");
        List<Integer> transformed = animalList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Строки преобразованные в длины: " + transformed);
        System.out.println();

        //Задание 4 Создание списка квадратов чисел

        List<Integer> squareList = Arrays.asList(2,4,8,16,32);
        List<Integer> squared = squareList.stream()
                .map(n -> n * n)
                .toList();

        System.out.println("Список квадратов чисел: " + squared);
        System.out.println();

        // Задание 5 Удаление дубликатов из списка

        List<String> duplicateList = Arrays.asList("Анна М", "Петр К", "Николай С", "Петр К", "Анна М");
        List<String> removedDuplicate = duplicateList.stream()
                .distinct()
                .toList();

        System.out.println("Список без дублей: " + removedDuplicate);
    }
}
