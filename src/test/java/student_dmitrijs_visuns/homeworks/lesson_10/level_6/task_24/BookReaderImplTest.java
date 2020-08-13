package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_24;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void CheckIfReadBooksListIsCorrect () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Heinlein", "Tunnel");
        Book book2 = new Book("Walt Disney", "Duck Tales");
        Book book3 = new Book("Mark Twain", "Heck Finn");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        prototype.addBookToLibrary(book3);
        prototype.markBookAsRead(book1);
        prototype.markBookAsRead(book3);
        String[] testBooksListAsArray = prototype.getReadBooksListFromLibrary();
        assertEquals(testBooksListAsArray[0], "Tunnel [Heinlein]");
        assertEquals(testBooksListAsArray[1], "Heck Finn [Mark Twain]");
        assertTrue(testBooksListAsArray.length == 2);
    }

}