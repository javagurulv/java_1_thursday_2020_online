package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_13;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkIfRemovesAllBooksByAuthor () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Jurassic Park");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "Jurassic Park 2");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.deleteByAuthor("Jack");
        assertTrue(prototype.booksList.size() == 1);
        assertTrue(!prototype.booksList.contains(book1));
        assertTrue(!prototype.booksList.contains(book3));
    }

    @Test
    public void checkIfNotFoundAuthor () {
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Jurassic Park");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "Jurassic Park 2");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        prototype.deleteByAuthor("Peter");
        assertTrue(prototype.booksList.size() == 3);
    }

}