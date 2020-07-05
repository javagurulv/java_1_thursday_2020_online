package student_aleksey_kodin.lesson11.level1.task_5;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookListContainsDemoTest {
    BookListContainsDemo demo = new BookListContainsDemo();
    List<Book> books = new ArrayList<>();
    Book book_1 = new Book("Author#1", "Book#1");
    Book book_2 = new Book("Author#2", "Book#2");
    Book book_3 = new Book("Author#3", "Book#3");
    Book book_4 = new Book("Author#4", "Book#4");

    @Before
    public void createList() {
        books.add(book_1);
        books.add(book_2);
        books.add(book_3);
        books.add(book_4);
    }

    @Test
    public void findBook_waitingTrue_1() {

        boolean result = demo.findBook(books,"Book#3");

        assertTrue(result);
    }

    @Test
    public void findBook_waitingTrue_2() {

        boolean result = demo.findBook(books,"Book#1");

        assertTrue(result);
    }

    @Test
    public void findBook_waitingFalse_1() {

        boolean result = demo.findBook(books,"Book#9");

        assertFalse(result);
    }

    @Test
    public void findBook_waitingFalse_2() {

        boolean result = demo.findBook(books,"Book");

        assertFalse(result);
    }
}