package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void TestForReturnTrueIfBookIsAdded () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        assertTrue(prototype.addBookToLibrary(book1));
    }

    @Test
    public void TestForReturnFalseIfHasSameBook() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book1);
        Book book2 = new Book ("Heinlein", "Tunnel");
        assertFalse(prototype.addBookToLibrary(book2));

    }

    @Test
    public void TestForAddingBookToLibrary() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book1);
        assertEquals(book1, prototype.readerLibrary.get(0));
    }

    @Test
    public void TestForNotAddingBookToLibrary() {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book1);
        Book book2 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book2);
        assertTrue(prototype.readerLibrary.size() == 1);
    }




}