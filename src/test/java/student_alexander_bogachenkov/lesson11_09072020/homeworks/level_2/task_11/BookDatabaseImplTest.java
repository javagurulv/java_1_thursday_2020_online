package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnFilledListWithTheSameTitles() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        bookDatabase.save(new Book("Jonathan Ian Schwartz", "Clean Code"));
        List<Book> actual = bookDatabase.findByTitle("Clean Code");
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("Robert Martin", "Clean Code"));
        expected.add(new Book("Jonathan Ian Schwartz", "Clean Code"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnFilledListWithTheSameTitles_whenTitleToFindNotExists() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        List<Book> actual = bookDatabase.findByTitle("Harry Potter. Third Part");
        List<Book> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
}