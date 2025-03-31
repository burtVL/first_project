package practice_8;

import practice_8.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Преступление и наказание", "Федор Достоевский"));
        library.addBook(new Book("Колыбель для кошки", "Курт Воннегут"));
        library.addBook(new Book("Колыбель для кошки", "Курт Воннегут"));

        try {
            library.findBook("Привет");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение!!!");
        }

    }
}
