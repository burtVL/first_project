package homework_6.ex_10_ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте ArrayDeque, добавьте 5 элементов и выведите их.
        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.add("Id-35345");
        stack.add("Id-563");
        stack.add("Id-39145");
        stack.add("Id-79425");
        stack.add("Id-9764");

        System.out.println("ID сотрудников: " + stack);
        System.out.println();

        // Задание 2 Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке

        ArrayDeque<String> stack2 = new ArrayDeque<>();

        stack2.push("Id-35345");
        stack2.push("Id-563");
        stack2.push("Id-464534");
        stack2.push("Id-97867");
        stack2.push("Id-454");

        System.out.println("Элементы в обратном порядке: ");
        while (!stack2.isEmpty()) {
            String id = stack2.pop();
            System.out.println(id);
        }
    }
}
