package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkForInitialBooksCount () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        assertTrue(prototype.booksList.size() == 0);
    }

    @Test
    public void checkForBooksCount () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Peter", "Jurassic Park");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "Jurassic Park");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        assertTrue(prototype.booksList.size() == 3);

    }
}