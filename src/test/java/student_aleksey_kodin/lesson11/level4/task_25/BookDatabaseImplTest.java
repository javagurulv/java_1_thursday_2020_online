package student_aleksey_kodin.lesson11.level4.task_25;

import org.junit.Before;
import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1", "2015");
    Book book_2 = new Book("Author#2", "Book#2", "2016");
    Book book_3 = new Book("Author#3", "Book#3", "2017");
    Book book_4 = new Book("Author#4", "Book#4", "2018");

    @Before
    public void createList() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
    }

    @Test
    public void findUniqueBooks_1() {
        Set<Book> result = demo.findUniqueBooks();
        int size = result.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueBooks_2() {
        demo.save(book_1);
        Set<Book> result = demo.findUniqueBooks();
        int size = result.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueBooks_3() {
        demo.save(book_1);
        demo.save(book_1);
        Set<Book> result = demo.findUniqueBooks();
        int size = result.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueBooks_4() {
        demo.save(book_1);
        demo.save(book_1);
        demo.save(book_2);
        Set<Book> result = demo.findUniqueBooks();
        int size = result.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueBooks_5() {
        demo.save(book_1);
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_2);
        Set<Book> result = demo.findUniqueBooks();
        int size = result.size();

        assertEquals(4,size);
    }
}