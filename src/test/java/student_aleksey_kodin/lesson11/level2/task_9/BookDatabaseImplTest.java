package student_aleksey_kodin.lesson11.level2.task_9;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1");
    Book book_2 = new Book("Author#2", "Book#2");
    Book book_3 = new Book("Author#3", "Book#3");
    Book book_4 = new Book("Author#4", "Book#4");

    @Before
    public void createList() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
    }

    @Test
    public void findById_1_waiting_True() {
        Optional <Book> searchBook = demo.findById(4L);
        boolean result = searchBook.isPresent();
        assertTrue(result);
    }

    @Test
    public void findById_2_waiting_True() {
        Optional <Book> searchBook = demo.findById(3L);
        boolean result = searchBook.isPresent();
        assertTrue(result);
    }

    @Test
    public void findById_3_waiting_True() {
        Optional <Book> searchBook = demo.findById(2L);
        boolean result = searchBook.isPresent();
        assertTrue(result);
    }

    @Test
    public void findById_4_waiting_True() {
        Optional <Book> searchBook = demo.findById(1L);
        boolean result = searchBook.isPresent();
        assertTrue(result);
    }

    @Test
    public void findById_5_waiting_False() {
        Optional <Book> searchBook = demo.findById(0L);
        boolean result = searchBook.isPresent();
        assertFalse(result);
    }

    @Test
    public void findById_6_waiting_False() {
        Optional <Book> searchBook = demo.findById(-5L);
        boolean result = searchBook.isPresent();
        assertFalse(result);
    }

    @Test
    public void findById_7_waiting_False() {
        Optional <Book> searchBook = demo.findById(8L);
        boolean result = searchBook.isPresent();
        assertFalse(result);
    }
}