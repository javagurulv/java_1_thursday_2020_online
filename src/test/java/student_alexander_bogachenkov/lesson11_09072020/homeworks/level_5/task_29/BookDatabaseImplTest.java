package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_5.task_29;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnEachAuthorBookCount() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("J. K. Rowling", "Harry Potter", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2010"));
        database.save(new Book("J. K. Rowling", "Harry Potter. Second Part", "2012"));
        database.save(new Book("J. K. Rowling", "Harry Potter. Third Part", "20013"));
        database.save(new Book("Bruce Eckel", "Thinking in JAVA", "2004"));
        Map<String, Integer> actual = database.getEachAuthorBookCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("J. K. Rowling", 3);
        expected.put("Robert Martin", 1);
        expected.put("Bruce Eckel", 1);
        assertEquals(expected, actual);
    }
}