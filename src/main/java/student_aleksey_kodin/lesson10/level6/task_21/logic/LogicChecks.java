package student_aleksey_kodin.lesson10.level6.task_21.logic;

import student_aleksey_kodin.lesson10.level6.task_21.Book;

import java.util.List;
import java.util.Optional;

public class LogicChecks {

    public static boolean isBookExists(List<Book> books, Book book) {

        Optional<Book> searchBook = books.stream().filter(b -> b.equals(book)).findFirst();

        return searchBook.isPresent();
    }

    public static boolean isBookTitleNotEmpty(Book book) {
        if (book.getBookName() == null) {
            return false;
        }
        return !(book.getBookName().trim().isEmpty());
    }

    public static boolean isBookAuthorNotEmpty(Book book) {
        if (book.getBookAuthor() == null) {
            return false;
        }
        return !(book.getBookAuthor().trim().isEmpty());
    }
}
