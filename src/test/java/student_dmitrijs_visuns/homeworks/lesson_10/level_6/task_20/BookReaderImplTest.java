package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_20;

import org.junit.Test;
import student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_20.Book;
import student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_20.BookReaderImpl;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BookReaderImplTest {

    @Test
    public void successfulExactTitleInput () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Russian", "VinnyPooh");
        Book book2 = new Book ("English", "VinnyPooh");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> searchTestList = prototype.findBookByExactTitle("VinnyPooh");
        assertTrue(searchTestList.contains(book1));
        assertTrue(searchTestList.contains(book2));

    }

    @Test
    public void unsuccessfulExactTitleInput () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Russian", "VinnyPooh");
        Book book2 = new Book("English", "VinnyPooh");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        List<Book> searchTestList = prototype.findBookByExactTitle("VinniPuh");
        assertTrue(!searchTestList.contains(book1));
        assertTrue(!searchTestList.contains(book2));
    }

}