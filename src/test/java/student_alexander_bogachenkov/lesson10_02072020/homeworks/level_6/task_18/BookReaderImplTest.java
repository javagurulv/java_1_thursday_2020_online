package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_18;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldFindBooksByAuthor() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("The Casual Vacancy", "J. K. Rowling"));
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("Harry Potter", "J. K. Rowling"));
        expected.add(new Book("The Casual Vacancy", "J. K. Rowling"));
        List<Book> actual = bookReader.findBooksByAuthor("J. K. Rowling");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindBooksByAuthor_whenBooksNotExist() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("The Casual Vacancy", "J. K. Rowling"));
        List<Book> expected = new ArrayList<>();
        List<Book> actual = bookReader.findBooksByAuthor("Bowling");
        assertEquals(expected, actual);
    }
}