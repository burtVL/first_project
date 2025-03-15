package homework_6.ex_5_TreeSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        TreeSet<Integer> numberOfTree = new TreeSet<>();

        numberOfTree.add(34);
        numberOfTree.add(267);
        numberOfTree.add(12);
        numberOfTree.add(33568);
        numberOfTree.add(435);

        System.out.println(numberOfTree);
        System.out.println();

        //Задание 2

        addnumberWithoutDuplicates(numberOfTree, 678);
        addnumberWithoutDuplicates(numberOfTree, 33568);
        addnumberWithoutDuplicates(numberOfTree, 12);
        addnumberWithoutDuplicates(numberOfTree, 50000);
        addnumberWithoutDuplicates(numberOfTree, 4);
        System.out.println();

        System.out.println(numberOfTree);
        System.out.println();

        //Задание 3
        TreeSet<Integer> setOfNumber = new TreeSet<>();

        setOfNumber.addAll(Arrays.asList(45, 454, 6, 7676, 346));

        int targetNumber = 514;

        Integer higher = setOfNumber.higher(targetNumber);
        Integer lower = setOfNumber.lower(targetNumber);
        System.out.println("Заданное число: " + targetNumber);
        if (higher != null) {
            System.out.println("Ближайшее большее число: " + higher);
        } else {
            System.out.println("Ближайшего большего числа не существует.");
        }
        if (lower != null) {
            System.out.println("Ближайшее меньшее число: " + lower);
        } else {
            System.out.println("Ближайшего меньшего числа не существует.");
        }
    }
    //Задание 2
    public static void addnumberWithoutDuplicates(TreeSet<Integer> numberOfTree, Integer newNumber) {
        if (numberOfTree.add(newNumber)) {
            System.out.println("Число \"" + newNumber + "\" добавлено.");
        } else {
            System.out.println("Число \"" + newNumber + "\" уже существует, дубликат не добавлен.");
        }
    }
}