package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_26;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkForTrueIfContainsBook () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("John", "Aurora", "1935");
        prototype.save(book1);
        prototype.save(book2);

        assertTrue(prototype.contains(book1));
        assertTrue(prototype.contains(book2));
    }

    @Test
    public void checkForFalseIfNoBook () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("John", "Aurora", "1935");
        prototype.save(book1);

        assertFalse(prototype.contains(book2));
    }

}