package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnStringArrayWithAllBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        String[] expected = {"Harry Potter [J. K. Rowling] ", "Clean Code [Robert Martin] "};
        String[] actual = bookReader.getAllBooks();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringArray_whenNoBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        String[] expected = {};
        String[] actual = bookReader.getAllBooks();
        assertArrayEquals(expected, actual);
    }
}