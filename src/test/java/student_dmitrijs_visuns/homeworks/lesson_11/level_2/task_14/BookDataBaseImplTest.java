package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkIfRemovesAllBooksByTitle () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Jurassic Park");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Mihailo", "Jurassic Park");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.deleteByTitle("Jurassic Park");
        assertTrue(prototype.booksList.size() == 1);
        assertTrue(!prototype.booksList.contains(book1));
        assertTrue(!prototype.booksList.contains(book3));
    }


    @Test
    public void checkIfNoBooksByTitle () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Jurassic Park");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Mihailo", "Jurassic Park");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.deleteByTitle("Alien");
        assertTrue(prototype.booksList.size() == 3);
    }


}