package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_4.task_25;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldFindUniqueBooks_whenSetIsFilled() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("J. K. Rowling", "Harry Potter", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2009"));
        database.save(new Book("J. K. Rowling", "Harry Potter", "2010"));
        database.save(new Book("J. K. Rowling", "Harry Potter", "2011"));
        database.save(new Book("Bruce Eckel", "Thinking in JAVA", "2009"));
        Set<Book> actual = database.findUniqueBooks();
        Set<Book> expected = new HashSet<>();
        expected.add(new Book("J. K. Rowling", "Harry Potter", "2009"));
        expected.add(new Book("Robert Martin", "Clean Code", "2009"));
        expected.add(new Book("J. K. Rowling", "Harry Potter", "2010"));
        expected.add(new Book("J. K. Rowling", "Harry Potter", "2011"));
        expected.add(new Book("Bruce Eckel", "Thinking in JAVA", "2009"));
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindUniqueBooks_whenSetIsEmpty() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Set<Book> actual = database.findUniqueBooks();
        Set<Book> expected = new HashSet<>();
        assertEquals(expected, actual);
    }
}