package practice_8;

import practice_8.exceptions.BookNotFoundException;
import practice_8.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }

    //добавлять книгу
    // обработка исключения: если мы добавляем существующую книгу, то получаем не проверяемое исключение InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Такая книга уже существует в бибилиотеке");
        } else {
            books.add(book);
        }
    }


    //искать книгу
    // обработка исключения: если мы не можем найти книгу, то случится проверяемое исключение BookNotFoundException

    public Book findBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();

        books.forEach(book -> {
            if (book.getName().equals(name)) {
                foundBook.set(book);
            }
        });

        if (foundBook.get() == null) {
            throw new  BookNotFoundException("Не нашли книгу по названию " + name);
        }
        return foundBook.get();
    }

}
