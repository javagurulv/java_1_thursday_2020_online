package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_22;

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
    public void isCheckForBookInLibraryCorrect() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.addBookToLibrary(book1);
        assertTrue(prototype.markBookAsRead(book1));
    }

    @Test
    public void isCheckForNoBookInLibraryCorrect() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        assertFalse(prototype.markBookAsRead(book1));
    }

    @Test
    public void checkForReturnTrueIfMarkedAsRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.addBookToLibrary(book1);
        prototype.markBookAsRead(book1);
        assertTrue(book1.isRead());
    }

    @Test
    public void checkForReturnFalseIfNotMarkedAsRead() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Chekhov", "Seagull");
        prototype.markBookAsRead(book1);
        assertFalse(book1.isRead());
    }




}