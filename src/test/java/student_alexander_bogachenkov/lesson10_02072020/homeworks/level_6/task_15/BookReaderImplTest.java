package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldNotAddBook_whenTitleIsNotIndicated() {
        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expected = false;
        boolean actual = bookReader.addBook(new Book("", "J. K. Rowling"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAddBook_whenTitleIsNull() {
        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expected = false;
        boolean actual = bookReader.addBook(new Book(null, "J. K. Rowling"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAddBook_whenAuthorIsNotIndicated() {
        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expected = false;
        boolean actual = bookReader.addBook(new Book("Harry Potter", ""));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAddBook_whenAuthorIsNull() {
        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expected = false;
        boolean actual = bookReader.addBook(new Book("Harry Potter", null));
        assertEquals(expected, actual);
    }

}