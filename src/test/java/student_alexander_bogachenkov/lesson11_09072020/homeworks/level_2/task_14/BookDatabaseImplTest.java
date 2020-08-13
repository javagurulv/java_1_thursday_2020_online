package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldDeleteBooksByTitle() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        bookDatabase.save(new Book("Jonathan Ian Schwartz", "Clean Code"));
        bookDatabase.deleteByTitle("Clean Code");
        List<Book> actual = bookDatabase.getBooks();
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("J. K. Rowling", "Harry Potter"));
        expected.add(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        assertEquals(expected, actual);
    }

}