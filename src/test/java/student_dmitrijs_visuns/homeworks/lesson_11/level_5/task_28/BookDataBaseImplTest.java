package student_dmitrijs_visuns.homeworks.lesson_11.level_5.task_28;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void testForMappingOneAuthor () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book ("Jack", "A", "1900");
        prototype.save(book1);
        Map<String, List> testMap = prototype.getAuthorToBooksMap();
        assertTrue(testMap.size() == 1);
        assertTrue(testMap.get("Jack").contains(book1));
    }

    @Test
    public void testForMappingTwoAuthors () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book ("Jack", "A", "1900");
        Book book2 = new Book ("Jack", "B", "1900");
        Book book3 = new Book ("John", "C", "1900");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        Map<String, List> testMap = prototype.getAuthorToBooksMap();
        assertTrue(testMap.size() == 2);
        assertTrue(testMap.get("Jack").contains(book1));
        assertTrue(testMap.get("Jack").contains(book2));
        assertTrue(testMap.get("John").contains(book3));
    }

    @Test
    public void testForMappingNoAuthors () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Map<String, List> testMap = prototype.getAuthorToBooksMap();
        assertTrue(testMap.isEmpty());
    }

}