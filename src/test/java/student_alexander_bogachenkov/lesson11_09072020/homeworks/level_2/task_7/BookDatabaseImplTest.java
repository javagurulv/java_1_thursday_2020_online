package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnTrue_whenIdExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        long testId = bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        boolean actual = bookDatabase.delete(testId);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenIdNotExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        boolean actual = bookDatabase.delete(7L);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}