package homework_6.ex_9_PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(56);
        priorityQueue.offer(22);
        priorityQueue.offer(34);
        priorityQueue.offer(5);
        priorityQueue.offer(7);

        System.out.println("Числа в порядке удаления: ");
        while (!priorityQueue.isEmpty()) {
            int number = priorityQueue.poll();
            System.out.println(number);
        }

    }
}
