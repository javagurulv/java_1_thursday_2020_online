package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_9;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnNonNulledOptional_whenIdExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second part"));
        Optional<Book> actual = bookDatabase.findById(2L);
        Optional<Book> expected = Optional.of(new Book("J. K. Rowling", "Harry Potter. Second part"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNulledOptional_whenIdNotExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second part"));
        Optional<Book> actual = bookDatabase.findById(8L);
        Optional<Book> expected = Optional.empty();
        assertEquals(expected, actual);
    }
}