package homework_6.ex_8_TreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
        TreeMap<String, Integer> gradeBook = new TreeMap<>();

        gradeBook.put("Иванов Иван", 5);
        gradeBook.put("Петров Денис", 3);
        gradeBook.put("Алферов Роман", 2);
        gradeBook.put("Фролов Степан", 4);
        gradeBook.put("Соколова Дарья", 5);

        for (Map.Entry<String, Integer> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + " - оценка - " + entry.getValue());
        }
        System.out.println();

        //Задание 2 Найдите минимальный и максимальный ключ в TreeMap

        System.out.println("Первый по списку: " + gradeBook.firstKey() + "." + " Последний по списку: " + gradeBook.lastKey() + ".");
        System.out.println();

        //Задание 3 Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

        TreeMap<Integer, String> mapOfEmployeeAccess = new TreeMap<>();

        mapOfEmployeeAccess.put(323, "Филимонов");
        mapOfEmployeeAccess.put(4341, "Романов");
        mapOfEmployeeAccess.put(463, "Тараканова");
        mapOfEmployeeAccess.put(6866, "Соловьева");
        mapOfEmployeeAccess.put(137, "Бонадрев");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести ID для поиска: ");
        int targetId = scanner.nextInt();

        Integer higher = mapOfEmployeeAccess.higherKey(targetId);

        System.out.println("Заданный ID: " + targetId);
        if (higher != null) {
            System.out.println("Ближайшее большее ID: " + higher);
        } else {
            System.out.println("Более высокого ID нет.");
        }

    }
}
