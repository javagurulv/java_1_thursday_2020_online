package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldDeleteBooksByAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter"));
        bookDatabase.save(new Book("Robert Martin", "Clean Code"));
        bookDatabase.save(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        bookDatabase.save(new Book("Jonathan Ian Schwartz", "Clean Code"));
        bookDatabase.deleteByAuthor("J. K. Rowling");
        List<Book> actual = bookDatabase.getBooks();
        List<Book> expected = new ArrayList<>();
        expected.add(new Book("Robert Martin", "Clean Code"));
        expected.add(new Book("Jonathan Ian Schwartz", "Clean Code"));
        assertEquals(expected, actual);
    }

}