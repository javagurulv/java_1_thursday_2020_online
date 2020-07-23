package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_4.task_24;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldFindUniqueTitles_whenSetIsFilled() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("J. K. Rowling", "Harry Potter", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2009"));
        database.save(new Book("J. K. Rowling", "Harry Potter. Second Part", "2009"));
        database.save(new Book("Bruce Eckel", "Clean Code", "2009"));
        Set<String> actual = database.findUniqueTitles();
        Set<String> expected = new HashSet<>();
        expected.add("Harry Potter");
        expected.add("Clean Code");
        expected.add("Harry Potter. Second Part");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindUniqueTitles_whenSetIsEmpty() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Set<String> actual = database.findUniqueTitles();
        Set<String> expected = new HashSet<>();
        assertEquals(expected, actual);
    }
}