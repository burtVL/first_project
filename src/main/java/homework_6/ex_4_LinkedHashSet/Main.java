package homework_6.ex_4_LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //Задание 1 Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("1.Первая строка");
        myLinkedHashSet.add("2.Вторая строка");
        myLinkedHashSet.add("3.Третья строка");
        myLinkedHashSet.add("4.Четвертая строка");
        myLinkedHashSet.add("5.Пятая строка");

        System.out.println(myLinkedHashSet);
        System.out.println();

        //Задание 2

        addWithoutDuplicates(myLinkedHashSet, "2.Вторая строка");
        addWithoutDuplicates(myLinkedHashSet, "6.Шестая строка");
        addWithoutDuplicates(myLinkedHashSet, "4.Четвертая строка");
        addWithoutDuplicates(myLinkedHashSet, "7.Седьмая строка");
        addWithoutDuplicates(myLinkedHashSet, "2.Вторая строка");

        System.out.println(myLinkedHashSet);

    }

    public static void addWithoutDuplicates(LinkedHashSet<String> myLinkedHashSet, String newStrings) {
        if (myLinkedHashSet.add(newStrings)) {
            System.out.println("Срока \"" + newStrings + "\" добавлена.");
        } else {
            System.out.println("Срока \"" + newStrings + "\" уже существует, дубликат не добавлен.");
        }
    }
}
