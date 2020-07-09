package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldAddBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expected = true;
        boolean actual = bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAddBook_whenAlreadyExists() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        boolean expected = false;
        boolean actual = bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        assertEquals(expected, actual);
    }
}