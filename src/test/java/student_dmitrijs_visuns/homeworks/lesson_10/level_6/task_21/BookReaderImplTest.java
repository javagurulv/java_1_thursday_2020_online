package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_21;

import org.junit.Test;
import student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_21.Book;
import student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_21.BookReaderImpl;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookReaderImplTest {

    @Test
    public void checkForPartialTitle1 (){
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Miln", "VinnyPooh");
        Book book2 = new Book ("Miln", "VinnyThePooh");
        Book book3 = new Book ("Author", "Vendetta");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        prototype.addBookToLibrary(book3);
        List<Book> testListSearchByTitle = prototype.findBooksByTitle("V");
        assertTrue (testListSearchByTitle.contains(book1));
        assertTrue (testListSearchByTitle.contains(book2));
        assertTrue (testListSearchByTitle.contains(book3));
    }

    @Test
    public void checkForPartialTitle2 (){
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Russian", "VinnyPooh");
        Book book2 = new Book ("English", "Vinny Pooh");
        Book book3 = new Book ("Author", "Vendeta");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        prototype.addBookToLibrary(book3);
        List<Book> testListSearchByTitle = prototype.findBooksByTitle("Vinny");
        assertTrue (testListSearchByTitle.contains(book1));
        assertTrue (testListSearchByTitle.contains(book2));
        assertFalse(testListSearchByTitle.contains(book3));
    }


    @Test
    public void checkForTitleToLowercase (){
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Russian", "Vinny Pooh");
        Book book2 = new Book ("English", "VINNY Pooh");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> testListSearchByTitle = prototype.findBooksByTitle("viNNy");
        assertTrue (testListSearchByTitle.contains(book1));
        assertTrue (testListSearchByTitle.contains(book2));
    }

}