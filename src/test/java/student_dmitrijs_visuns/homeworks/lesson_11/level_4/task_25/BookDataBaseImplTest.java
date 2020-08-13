package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_25;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkForAddingAllUniqueBooks () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("Jack", "Aurora", "1975");
        Book book3 = new Book("Pete", "Aurora", "1975");
        Book book4 = new Book("John", "Aurora", "1975");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.save(book4);
        Set<Book> test = prototype.findUniqueBooks();
    }

    @Test
    public void checkForNoBooks () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Set<Book> testUniqueBooksSet = prototype.findUniqueBooks();
        assertTrue(testUniqueBooksSet.isEmpty());
    }

}