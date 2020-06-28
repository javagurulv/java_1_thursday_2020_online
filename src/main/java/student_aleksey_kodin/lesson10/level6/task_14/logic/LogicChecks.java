package student_aleksey_kodin.lesson10.level6.task_14.logic;

import student_aleksey_kodin.lesson10.level6.task_14.Book;

import java.util.List;
import java.util.Optional;

public class LogicChecks {

    public static boolean isBookExists(List<Book> books, Book book) {

        Optional<Book> searchBook = books.stream().filter(b -> b.equals(book)).findFirst();

        return searchBook.isPresent();
    }
}
