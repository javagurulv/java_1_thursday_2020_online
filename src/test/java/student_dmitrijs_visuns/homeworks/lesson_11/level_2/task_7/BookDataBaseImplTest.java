package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void confirmBookDeleteFromList (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        prototype.save(book1);
        prototype.save(book2);
        prototype.delete(1L);

        assertFalse(prototype.booksList.contains(book1));

    }

    @Test
    public void checkForFalseIfNoSuchBook (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        prototype.save(book1);
        prototype.save(book2);
        prototype.delete(1L);

        assertFalse(prototype.delete(1L));

    }

    @Test
    public void checkForTrueIfBookSuccessfullyDeleted (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        prototype.save(book1);
        prototype.save(book2);

        assertTrue(prototype.delete(1L));

    }

}