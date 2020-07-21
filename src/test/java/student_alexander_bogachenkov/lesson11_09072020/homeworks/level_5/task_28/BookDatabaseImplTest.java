package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_5.task_28;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnAuthorToBooksMap() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("J. K. Rowling", "Harry Potter", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2010"));
        database.save(new Book("J. K. Rowling", "Harry Potter. Second Part", "2012"));
        database.save(new Book("J. K. Rowling", "Harry Potter. Third Part", "20013"));
        database.save(new Book("Bruce Eckel", "Thinking in JAVA", "2004"));
        Map<String, List<Book>> actual = database.getAuthorToBooksMap();
        List<Book> rowlingList = new ArrayList<>();
        rowlingList.add(new Book("J. K. Rowling", "Harry Potter", "2009"));
        rowlingList.add(new Book("J. K. Rowling", "Harry Potter. Second Part", "2012"));
        rowlingList.add(new Book("J. K. Rowling", "Harry Potter. Third Part", "20013"));
        List<Book> martinList = new ArrayList<>();
        martinList.add(new Book("Robert Martin", "Clean Code", "2010"));
        List<Book> eckelList = new ArrayList<>();
        eckelList.add(new Book("Bruce Eckel", "Thinking in JAVA", "2004"));
        Map<String, List<Book>> expected = new HashMap<>();
        expected.put("J. K. Rowling", rowlingList);
        expected.put("Robert Martin", martinList);
        expected.put("Bruce Eckel", eckelList);
        assertEquals(expected, actual);
    }
}