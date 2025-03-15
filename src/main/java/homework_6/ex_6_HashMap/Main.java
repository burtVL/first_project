package homework_6.ex_6_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("Марина", 18);
        studentMap.put("Виктор", 19);
        studentMap.put("Алексей", 20);
        studentMap.put("Вика", 19);
        studentMap.put("Женя", 21);

        //System.out.println(studentMap);

        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " лет.");
        }

        //Задание 2 Проверьте, есть ли определённое имя в HashMap
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя для поиска:");
        String nameToFind = scanner.nextLine();

        if (studentMap.containsKey(nameToFind)) {
            int age = studentMap.get(nameToFind);
            System.out.println("Имя найдено:" + " ему/ей " + age + " лет.");
        }else {
            System.out.println("Имя не найдено");
        }


    }
}
