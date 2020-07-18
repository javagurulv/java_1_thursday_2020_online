package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnTrue_whenBookExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        boolean actual = bookDatabase.delete(new Book("J. K. Rowling", "Harry Potter"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenBookNotExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        boolean actual = bookDatabase.delete(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        boolean expected = false;
        assertEquals(expected, actual);
    }
}