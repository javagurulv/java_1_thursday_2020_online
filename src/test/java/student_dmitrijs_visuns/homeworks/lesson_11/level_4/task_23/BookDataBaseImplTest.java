package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_23;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkForAddingAllUniqueAuthors () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("Jack", "Aurora", "1975");
        Book book3 = new Book("Pete", "Aurora", "1975");
        Book book4 = new Book("John", "Aurora", "1975");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.save(book4);
        Set<String> testUniqueAuthorsSet = prototype.findUniqueAuthors();
        assertTrue(testUniqueAuthorsSet.size() == 3);
        assertTrue(testUniqueAuthorsSet.contains("Jack"));
        assertTrue(testUniqueAuthorsSet.contains("Pete"));
        assertTrue(testUniqueAuthorsSet.contains("John"));
    }

    @Test
    public void checkForNoAuthors () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Set<String> testUniqueAuthorsSet = prototype.findUniqueAuthors();
        assertTrue(testUniqueAuthorsSet.isEmpty());
    }



}