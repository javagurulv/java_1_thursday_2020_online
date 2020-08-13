package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldFindBooksByTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("The Casual Vacancy", "J. K. Rowling"));
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("Harry Potter", "J. K. Rowling"));
        List<Book> actual = bookReader.findBooksByTitle("Harry Potter");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindBooksByTitle_whenBooksNotExist() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("The Casual Vacancy", "J. K. Rowling"));
        List<Book> expected = new ArrayList<>();
        List<Book> actual = bookReader.findBooksByTitle("Gary Poter");
        assertEquals(expected, actual);
    }

}