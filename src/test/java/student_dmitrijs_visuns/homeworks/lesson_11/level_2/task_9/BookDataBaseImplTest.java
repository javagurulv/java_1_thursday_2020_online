package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_9;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkForCorrectOptionalOfBook (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jenny", "C");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        assertEquals(prototype.findById(3L), Optional.of(book3));

    }

    @Test
    public void checkForEmptyOptionalIfNoBookId (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jenny", "C");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        assertEquals(prototype.findById(6L), Optional.empty());

    }


}