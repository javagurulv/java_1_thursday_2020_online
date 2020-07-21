package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_25;

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
        String[] testArray = prototype.getNotReadBooksListFromLibrary();
        assertEquals(testArray[0], "Duck Tales [Walt Disney]");
        assertTrue(testArray.length == 1);
    }

}