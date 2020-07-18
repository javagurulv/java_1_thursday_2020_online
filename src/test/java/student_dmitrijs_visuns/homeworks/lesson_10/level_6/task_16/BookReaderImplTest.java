package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void ReturnTrueRemovingBookFromLibrary () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book1);
        assertTrue(prototype.removeBookFromLibrary(book1));
    }

    @Test
    public void ReturnFalseWhenNoSuchBookInLibrary () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Walt Disney", "Duck Tales");
        prototype.addBookToLibrary(book1);
        assertFalse(prototype.removeBookFromLibrary(book2));
    }

    @Test
    public void TestIfBookIsRemoved () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book1);
        prototype.removeBookFromLibrary(book1);
        assertTrue(prototype.addBookToLibrary(book1));
    }


}