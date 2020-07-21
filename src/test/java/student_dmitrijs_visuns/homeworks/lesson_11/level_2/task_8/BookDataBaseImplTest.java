package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_8;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void confirmBookDeleteFromList (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        prototype.save(book1);
        prototype.save(book2);
        prototype.delete(book1);

        assertFalse(prototype.booksList.contains(book1));

    }

    @Test
    public void checkForFalseIfNoSuchBook (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        prototype.save(book1);
        prototype.save(book2);
        prototype.delete(book1);

        assertFalse(prototype.delete(book1));

    }

    @Test
    public void checkForTrueIfBookSuccessfullyDeleted (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        prototype.save(book1);
        prototype.save(book2);

        assertTrue(prototype.delete(book1));

    }

}
