package homework_7.as_desired;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //Задание 1
        Storage<String> storageString = new Storage<>();
        Storage<Integer> storageInteger = new Storage<>();

        storageInteger.setItem(34);
        System.out.println(storageInteger.getItem());

        storageString.setItem("Generics");
        System.out.println(storageString.getItem());

    // Задание 2
    List<String> listElement = new ArrayList<>();

    listElement.add("One");
    listElement.add("Two");
    listElement.add("Three");
    listElement.add("Four");

    printList(listElement);

      
    }

    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element + " ");
        }
    }
}
