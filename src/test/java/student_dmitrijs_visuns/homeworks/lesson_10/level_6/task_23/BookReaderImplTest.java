package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_23;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void checkIsNewBookNotMarkedAsRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.addBookToLibrary(book1);
        assertFalse(book1.isRead());
    }

    @Test
    public void checkIfMarksReadBookAsNotRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.addBookToLibrary(book1);
        prototype.markBookAsRead(book1);
        prototype.markBookAsNotRead(book1);
        assertTrue(!book1.isRead());
    }

    @Test
    public void checkIfNotReadBookIsStillNotRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.addBookToLibrary(book1);
        prototype.markBookAsNotRead(book1);
        assertTrue(!book1.isRead());
    }

    @Test
    public void checkForReturnTrueIfMarkedAsNotRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.addBookToLibrary(book1);
        prototype.markBookAsRead(book1);
        assertTrue(prototype.markBookAsNotRead(book1));
    }

    @Test
    public void checkForReturnFalseIfNotMarkedAsRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.markBookAsRead(book1);
        assertFalse(prototype.markBookAsNotRead(book1));
    }


}