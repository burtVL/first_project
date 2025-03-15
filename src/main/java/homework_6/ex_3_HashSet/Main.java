package homework_6.ex_3_HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Задание 1 Создайте HashSet из 5 чисел и выведите его содержимое

        HashSet<Integer> numbers = new HashSet<>(List.of(32,4367,7878,12,23));
        System.out.println("Числа в HashSet: " + numbers);
        System.out.println();

        //Задание 2 Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

        numbers.add(434);
        numbers.add(2306);
        numbers.add(654);
        numbers.add(3);
        numbers.add(456);
        numbers.add(90);
        numbers.add(321);
        numbers.add(302);
        numbers.add(1098);
        numbers.add(3401);

        System.out.println("HashSet после добавления 10 чисел: " + numbers);
        System.out.println();

        boolean containsMyNumber = checkNumbers(numbers);
        if (containsMyNumber) {
            System.out.println("HashSet содержит число 12");
        } else {
            System.out.println("HashSet не содержит число 12");
        }

        System.out.println();

        //Задание 3
        List<String> someStrings = List.of("один", "два", "три", "два", "один", "пять", "один");


        Set<String> stringsWithoutDuplicates = removeDuplicates(someStrings);

        System.out.println("Список без дубликатов: " + stringsWithoutDuplicates);
        System.out.println();

        // Задание 4. Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет,
        //содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

        HashSet<String> nameSet = new HashSet<>(List.of("Марина", "Коля", "Даша", "Петр", "Аглая"));

        System.out.println("Список имен: " + nameSet);

        boolean containsMyName = checkMyName(nameSet);
        if (containsMyName) {
            System.out.println("HashSet содержит мое имя: Артем ");
        } else {
            System.out.println("HashSet не содержит мое имя");
        }
    }

    public static boolean checkNumbers(HashSet<Integer> integers) {
        int numberToCheck = 12;
        return integers.contains(numberToCheck);
    }
    //Задание 3
    public static Set<String> removeDuplicates(List<String> someStrings) {
        Set<String> set = new HashSet<>();
        set.addAll(someStrings);
        return set;
    }
    //Задание 4
    public static boolean checkMyName(HashSet<String> strings) {
        String myName = "Артем";
        return strings.contains(myName);
    }
}


