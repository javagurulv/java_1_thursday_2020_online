package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnFilledListWithTheSameAuthors() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Third Part"));
        List<Book> actual = bookDatabase.findByAuthor("J. K. Rowling");
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("J. K. Rowling", "Harry Potter"));
        expected.add(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        expected.add(new Book("J. K. Rowling", "Harry Potter. Third Part"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnFilledListWithTheSameAuthors_whenAuthorToFindNotExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Third Part"));
        List<Book> actual = bookDatabase.findByAuthor("Jules Verne");
        List<Book> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
}