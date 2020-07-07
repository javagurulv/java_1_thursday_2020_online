package student_aleksey_kodin.lesson11.level2.task_8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


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
    public void delete_1_waiting_True() {
        boolean result = demo.delete(book_4);
        assertTrue(result);
    }

    @Test
    public void delete_2_waiting_True() {
        boolean result = demo.delete(book_3);
        assertTrue(result);
    }

    @Test
    public void delete_3_waiting_True() {
        boolean result = demo.delete(book_2);
        assertTrue(result);
    }

    @Test
    public void delete_4_waiting_True() {
        boolean result = demo.delete(book_1);
        assertTrue(result);
    }

    @Test
    public void delete_5_waiting_False() {
        demo.delete(book_1);
        boolean result = demo.delete(book_1);
        assertFalse(result);
    }

    @Test
    public void delete_6_waiting_False() {
        demo.delete(book_2);
        boolean result = demo.delete(book_2);
        assertFalse(result);
    }

    @Test
    public void delete_7_waiting_False() {
        demo.delete(book_3);
        boolean result = demo.delete(book_3);
        assertFalse(result);
    }
}