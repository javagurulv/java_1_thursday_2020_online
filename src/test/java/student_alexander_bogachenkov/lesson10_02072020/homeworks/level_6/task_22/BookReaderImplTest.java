package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_22;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnTrue_whenBookExists() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("Harry Potter. Third Part", "J. K. Rowling"));
        bookReader.addBook(new Book("Harry Potter. Second Part", "J. K. Rowling"));
        Book testBook = new Book("Children of Captain Grant", "Jules Verne");
        bookReader.addBook(testBook);
        boolean actual = bookReader.markAsRead(testBook);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenBookNotExists() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("Harry Potter. Third Part", "J. K. Rowling"));
        boolean actual = bookReader.markAsRead(new Book("Harry Potter. Second Part", "J. K. Rowling"));
        boolean expected = false;
        assertEquals(expected, actual);
    }
}