package homework_8.part_3_stream_api_aggregation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Задание 1 Поиск максимального элемента

        List<Integer> numbers = Arrays.asList(3246, 32346, 65643, 232, 2, 35687);
        Integer maxElement = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println("Максимальное число: " + maxElement);
        System.out.println();

        //Задание 2 Поиск минимального элемента

        List<Integer> numbers2 = Arrays.asList(3246, 32346, 65643, 232, 2, 35687);
        Integer maxElement2 = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("Минимальное число: " + maxElement2);
        System.out.println();

        //Задание 3 Сумма всех элементов списка
        List<Integer> numbers3 = Arrays.asList(3246,32346,65643,232,35658);
        int sumElement = numbers3.stream()
                .mapToInt(n->n)
                .sum();

        System.out.println("Сумма всех элементов: " + sumElement);
        System.out.println();

        //Задание 4 Поиск первого элемента, начинающегося на "Б"

        List<String> animalList = Arrays.asList("Кит", "Панда", "Баран", "Змея");
        Optional<String> checkFirstElement = animalList.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println("Первый элемент начинающийся на Б: " + checkFirstElement);
        System.out.println();

        //Задание 5 Проверка наличия хотя бы одного элемента по условию

        List<Integer> numbers4 = Arrays.asList(-4, 0, 3, 8);
        boolean isCondition = numbers4.stream()
                .anyMatch(n-> n <= 0);

        System.out.println("Элемент соответствует условию: " + isCondition);
    }
}
