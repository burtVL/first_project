package homework_6.ex_2_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("Первая строка");
        stringLinkedList.add("Вторая строка");
        stringLinkedList.add("Третья строка");
        stringLinkedList.add("Четвертая строка");
        stringLinkedList.add("Пятая строка");

        System.out.println("Список из 5 строк: " + stringLinkedList);
        System.out.println();

        //Задание 3 Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка
        LinkedList<String> hunterList = new LinkedList<>();

        hunterList.add("Каждый");
        hunterList.add("охотник");
        hunterList.add("желает");
        hunterList.add("знать");
        hunterList.add("где сидит");
        hunterList.add("фазан");

        System.out.println("Список охотника: " + hunterList);
        System.out.println();

        if (!hunterList.isEmpty()) {
            hunterList.getFirst();
            System.out.println("Получен первый элемент списка: " + hunterList.getFirst());
        } else {
            System.out.println("Список пуст, получение первого элемента не возможно");
        }

        if (!hunterList.isEmpty()) {
            hunterList.getLast();
            System.out.println("Получен последний элемент списка: " + hunterList.getLast());
        } else {
            System.out.println("Список пуст, получение первого элемента не возможно");
        }
        System.out.println();

        //Задание 4
        LinkedList<Integer> numbers = new LinkedList<>(List.of(34,765,655,76,754));

        System.out.println("Сумма всех чисел в списке: " + sumOfNumbers(numbers));

    }
    //Задание 4
    public static int sumOfNumbers(LinkedList<Integer> integers) {
        int sum = 0;

        for (int i = 0; i < integers.size(); i++ ) {
            sum = sum + integers.get(i);
        }
        return sum;
    }
}
