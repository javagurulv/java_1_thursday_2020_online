package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_19;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void checkForPartialAuthorName1 (){
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Heron", "Roman Tales");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> testListSearchByAuthor = prototype.findBooksByAuthorName("H");
        assertTrue (testListSearchByAuthor.contains(book1));
        assertTrue (testListSearchByAuthor.contains(book2));
    }

    @Test
    public void checkForPartialAuthorName2 (){
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Heron", "Roman Tales");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> testListSearchByAuthor = prototype.findBooksByAuthorName("Hei");
        assertTrue (testListSearchByAuthor.contains(book1));
        assertFalse (testListSearchByAuthor.contains(book2));
    }


    @Test
    public void checkForAuthorNameToLowercase (){
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Heron", "Roman Tales");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> testListSearchByAuthor = prototype.findBooksByAuthorName("HEINL");
        assertTrue (testListSearchByAuthor.contains(book1));
    }

}