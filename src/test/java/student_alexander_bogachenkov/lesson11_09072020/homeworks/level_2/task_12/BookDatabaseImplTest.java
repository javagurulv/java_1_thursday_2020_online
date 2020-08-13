package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldCountAllBooks_whenListIsFilled() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Third Part"));
        int actual = bookDatabase.countAllBooks();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAllBooks_whenListIsEmpty() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        int actual = bookDatabase.countAllBooks();
        int expected = 0;
        assertEquals(expected, actual);
    }
}