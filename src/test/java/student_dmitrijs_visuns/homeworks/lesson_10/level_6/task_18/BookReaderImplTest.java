package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_18;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void successfulExactAuthorInput () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Heinlein", "Citizen of Galaxy");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> searchTestList = prototype.findBookByExactAuthorName("Heinlein");
        assertTrue(searchTestList.contains(book1));
        assertTrue(searchTestList.contains(book2));

    }

    @Test
    public void unsuccessfulExactAuthorInput () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Heinlein", "Citizen of Galaxy");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> searchTestList = prototype.findBookByExactAuthorName("Heinle");
        assertTrue(!searchTestList.contains(book1));
        assertTrue(!searchTestList.contains(book2));

    }

}