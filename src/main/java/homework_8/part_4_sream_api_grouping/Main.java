package homework_8.part_4_sream_api_grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("Мурманск", "Санкт_Петербург", "Париж", "Стамбул", "Монако", "Петрозаводск");
        Map<String, List<String>> groupedByFirstWord = city.stream()
                .collect(Collectors.groupingBy(word->word.substring(0,1)));

        System.out.println("Группировка по первой букве: ");
        groupedByFirstWord.forEach((letter, cityList) ->System.out.println(letter + ":" + cityList)
        );
        System.out.println();

        //Задание 2 Группировка чисел по чётности

        List<Integer> numbers = Arrays.asList(25,34,5,6,40);
        Map<Boolean, List<Integer>> filteredNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println("Группировка чисел по четности: " + filteredNumbers);
        System.out.println();

        //Задание 3 Поиск среднего значения чисел

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Double averagedNumbers = numbers2.stream()
                .collect(Collectors.averagingDouble(n->n));

        System.out.println("Среднее значение чисел: " + averagedNumbers);
    }
}
