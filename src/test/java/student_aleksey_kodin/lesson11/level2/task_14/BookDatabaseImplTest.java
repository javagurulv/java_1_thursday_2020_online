package student_aleksey_kodin.lesson11.level2.task_14;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1");

    @Before
    public void createList() {
        demo.save(book_1);
    }

    @Test
    public void deleteByTitle_1_One_Book() {
        demo.deleteByTitle("Book#1");

        List<Book> searchByTitle = demo.findByTitle("Book#1");
        int result = searchByTitle.size();

        assertEquals(0,result);
    }

    @Test
    public void deleteByTitle_2_Two_Book() {
        demo.save(book_1);

        demo.deleteByTitle("Book#1");

        List<Book> searchByTitle = demo.findByTitle("Book#1");
        int result = searchByTitle.size();

        assertEquals(0,result);
    }

    @Test
    public void deleteByTitle_3_Three_Book() {
        demo.save(book_1);
        demo.save(book_1);

        demo.deleteByTitle("Book#1");

        List<Book> searchByTitle = demo.findByTitle("Book#1");
        int result = searchByTitle.size();

        assertEquals(0,result);
    }

    @Test
    public void deleteByTitle_4_Four_Book() {
        demo.save(book_1);
        demo.save(book_1);
        demo.save(book_1);

        demo.deleteByTitle("Book#1");

        List<Book> searchByTitle = demo.findByTitle("Book#1");
        int result = searchByTitle.size();

        assertEquals(0,result);
    }
}