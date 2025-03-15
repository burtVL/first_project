package modificatorTest;

import homework_3.Library;

public class Main {
    public static void main(String[] args) {
        Library book = new Library("Колыбель для кошки", "Курт Воннегут", 1948, "Драма");

        System.out.println("Доступ к полю из любого места к полю Category: " + book.category);
        System.out.println("Доступ к полю из другого пакета к полю year: " + book.getYear());
        System.out.println("Доступ к полю из любого места к полю author: " + book.getAuthor());
        System.out.println("Доступ к полю из любого места к полю bookTitle: " + book.getBookTitle());


    }
}
