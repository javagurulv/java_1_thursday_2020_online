package student_aleksey_kodin.lesson11.level5.task_29;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1", "2015");
    Book book_2 = new Book("Author#1", "Book#2", "2016");
    Book book_3 = new Book("Author#3", "Book#3", "2017");
    Book book_4 = new Book("Author#4", "Book#4", "2018");
    Book book_5 = new Book("Author#4", "Book#4", "2018");
    Book book_6 = new Book("Author#4", "Book#4", "2018");
    Book book_7 = new Book("Author#4", "Book#4", "2018");

    @Before
    public void createList() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
        demo.save(book_5);
        demo.save(book_6);
        demo.save(book_7);
    }

    @Test
    public void getEachAuthorBookCount() {
        Map<String, Integer> result = demo.getEachAuthorBookCount();

        int size = result.size();
        assertEquals(3, size);

        int booksCount = result.get("Author#1");
        assertEquals(2, booksCount);

        int booksCount_1 = result.get("Author#3");
        assertEquals(1, booksCount_1);

        int booksCount_2 = result.get("Author#4");
        assertEquals(4, booksCount_2);
    }
}