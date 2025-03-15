package homework_6.ex_7_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1 Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        LinkedHashMap<String, Integer> carDetails = new LinkedHashMap<>();

        carDetails.put("Масло моторное 4л", 3000);
        carDetails.put("Анифриз 6л", 1000);
        carDetails.put("Фильтр масляный", 700);
        carDetails.put("Колодки тормозные передние, пара", 2700);
        carDetails.put("Дворники передние", 1500);

        for (Map.Entry<String, Integer> entry : carDetails.entrySet()) {
            System.out.println(entry.getKey() + " - цена - " + entry.getValue() + " руб.");
        }

        //Задание 2 Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

        phoneBook.put("Артем", "+7-900-345-45-20");
        phoneBook.put("Юра", "+7-934-456-76-20");
        phoneBook.put("Дима", "+7-956-976-45-35");
        phoneBook.put("Юля", "+7-901-567-12-00");
        phoneBook.put("Катя", "+7-095-123-13-78");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя для поиска: ");
        String nameToFind = scanner.nextLine();

        if (phoneBook.containsKey(nameToFind)) {
            String numberOfPhone = phoneBook.get(nameToFind);
            System.out.println("Контакт найден: " + nameToFind + " - " + numberOfPhone);
        } else {
            System.out.println("Контакт не найден");
        }
    }
}
