package com.kiet.Library.service;

import com.kiet.Library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(201, "Effective Java",
                "Joshua Bloch", "Programming", 2018, true));

        books.add(new Book(202, "Head First Java",
                "Kathy Sierra", "Programming", 2021, true));

        books.add(new Book(203, "The Alchemist",
                "Paulo Coelho", "Fiction", 2005, false));

        books.add(new Book(204, "Wings of Fire",
                "A. P. J. Abdul Kalam", "Biography", 1999, true));

        books.add(new Book(205, "Clean Architecture",
                "Robert C. Martin", "Programming", 2017, false));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(int bookId, Book updatedBook) {
        Book existingBook = getBookById(bookId);

        if (existingBook == null) {
            return null;
        }

        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setCategory(updatedBook.getCategory());
        existingBook.setPublicationYear(
                updatedBook.getPublicationYear());
        existingBook.setAvailable(updatedBook.isAvailable());

        return existingBook;
    }

    public boolean deleteBook(int bookId) {
        Book book = getBookById(bookId);

        if (book == null) {
            return false;
        }

        books.remove(book);
        return true;
    }

    public List<Book> searchByCategory(String category) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                result.add(book);
            }
        }

        return result;
    }

    public List<Book> findPublishedFromYear(int fromYear) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublicationYear() >= fromYear) {
                result.add(book);
            }
        }

        return result;
    }
}