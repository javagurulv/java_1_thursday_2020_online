package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_24;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkForAddingAllUniqueTitles () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("Jack", "Aurora", "1975");
        Book book3 = new Book("Pete", "Aurora", "1975");
        Book book4 = new Book("John", "Meteora", "1975");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.save(book4);
        Set<String> testUniqueTitlesSet = prototype.findUniqueTitles();
        assertTrue(testUniqueTitlesSet.size() == 2);
        assertTrue(testUniqueTitlesSet.contains("Aurora"));
        assertTrue(testUniqueTitlesSet.contains("Meteora"));
    }

    @Test
    public void checkForNoTitles () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Set<String> testUniqueTitlesSet = prototype.findUniqueTitles();
        assertTrue(testUniqueTitlesSet.isEmpty());
    }

}