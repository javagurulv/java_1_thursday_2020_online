package student_aleksey_kodin.lesson11.level4.task_26;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1", "2015");
    Book book_2 = new Book("Author#2", "Book#2", "2016");
    Book book_3 = new Book("Author#3", "Book#3", "2017");
    Book book_4 = new Book("Author#4", "Book#4", "2018");
    Book book_5 = new Book("Author#5", "Book#5", "2019");

    @Before
    public void createList() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
    }

    @Test
    public void contains_1() {
        boolean result = demo.contains(book_1);

        assertTrue(result);
    }

    @Test
    public void contains_2() {
        boolean result = demo.contains(book_2);

        assertTrue(result);
    }

    @Test
    public void contains_3() {
        boolean result = demo.contains(book_3);

        assertTrue(result);
    }

    @Test
    public void contains_4() {
        boolean result = demo.contains(book_4);

        assertTrue(result);
    }

    @Test
    public void contains_5_waiting_False() {
        boolean result = demo.contains(book_5);

        assertFalse(result);
    }
}