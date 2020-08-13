package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_24;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    private BookReaderImpl bookReader;

    @Before
    public void init() {
        this.bookReader = new BookReaderImpl();
    }

    @Test
    public void shouldReturnAllReadBooks() {
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin", true));
        bookReader.addBook(new Book("Harry Potter. Third Part", "J. K. Rowling", true));
        bookReader.addBook(new Book("Harry Potter. Second Part", "J. K. Rowling"));
        bookReader.addBook(new Book("Children of Captain Grant", "Jules Verne", true));
        String[] actual = bookReader.getAllReadBooks();
        String[] expected = {"Clean Code [Robert Martin] ", "Harry Potter. Third Part [J. K. Rowling] ", "Children of Captain Grant [Jules Verne] "};
        assertArrayEquals(expected, actual);
    }
}