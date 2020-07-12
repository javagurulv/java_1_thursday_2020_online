package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnTrue_whenBookToDeleteExists() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        boolean expected = true;
        boolean actual = bookReader.deleteBook(new Book("Harry Potter", "J. K. Rowling"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenBookToDeleteDoesNotExist() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        boolean expected = false;
        boolean actual = bookReader.deleteBook(new Book("Potter Gary", "K. J. Rawlink"));
        assertEquals(expected, actual);
    }

}