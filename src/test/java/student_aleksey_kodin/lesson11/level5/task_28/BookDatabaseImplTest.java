package student_aleksey_kodin.lesson11.level5.task_28;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1", "2015");
    Book book_2 = new Book("Author#1", "Book#2", "2016");
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
    public void getAuthorToBooksMap() {
        Map<String, List<Book>> result = demo.getAuthorToBooksMap();

        int size = result.size();
        assertEquals(3, size);

        List<Book> authorBooks = result.get("Author#1");
        assertEquals(2, authorBooks.size());

        List<Book> authorBooks_2 = result.get("Author#3");
        assertEquals(1, authorBooks_2.size());

        String title = authorBooks_2.get(0).getTitle();
        assertEquals("Book#3", title);

        List<Book> authorBooks_3 = result.get("Author#4");
        assertEquals(1, authorBooks_3.size());

        String title_2 = authorBooks_3.get(0).getTitle();
        assertEquals("Book#4", title_2);

    }
}