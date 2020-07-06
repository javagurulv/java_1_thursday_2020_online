package student_aleksey_kodin.lesson11.level2.task_10;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
    public void findByAuthor_1_Book_waiting_True() {
        List<Book> searchAuthor = demo.findByAuthor("Author#1");
        boolean result = (searchAuthor.size() == 1) && (searchAuthor.get(0).getAuthor().equals("Author#1"));
        assertTrue(result);
    }

    @Test
    public void findByAuthor_2_Book_waiting_True() {
        List<Book> searchAuthor = demo.findByAuthor("Author#2");
        boolean result = (searchAuthor.size() == 1) && (searchAuthor.get(0).getAuthor().equals("Author#2"));
        assertTrue(result);
    }

    @Test
    public void findByAuthor_3_Book_waiting_True() {
        List<Book> searchAuthor = demo.findByAuthor("Author#3");
        boolean result = (searchAuthor.size() == 1) && (searchAuthor.get(0).getAuthor().equals("Author#3"));
        assertTrue(result);
    }

    @Test
    public void findByAuthor_4_Book_waiting_True() {
        List<Book> searchAuthor = demo.findByAuthor("Author#4");
        boolean result = (searchAuthor.size() == 1) && (searchAuthor.get(0).getAuthor().equals("Author#4"));
        assertTrue(result);
    }

    @Test
    public void findByAuthor_5_Two_Books_waiting_True() {
        demo.save(book_1);
        List<Book> searchAuthor = demo.findByAuthor("Author#1");
        int authorCount = 0;
        for (Book book : searchAuthor) {
            if (book.getAuthor().equals("Author#1")) {
                authorCount++;
            }
        }
        boolean result = (searchAuthor.size() == 2) && (authorCount == 2);
        assertTrue(result);
    }

    @Test
    public void findByAuthor_6_Three_Books_waiting_True() {
        demo.save(book_1);
        demo.save(book_1);
        List<Book> searchAuthor = demo.findByAuthor("Author#1");
        int authorCount = 0;
        for (Book book : searchAuthor) {
            if (book.getAuthor().equals("Author#1")) {
                authorCount++;
            }
        }
        boolean result = (searchAuthor.size() == 3) && (authorCount == 3);
        assertTrue(result);
    }

    @Test
    public void findByAuthor_7_Four_Books_waiting_True() {
        demo.save(book_1);
        demo.save(book_1);
        demo.save(book_1);
        List<Book> searchAuthor = demo.findByAuthor("Author#1");
        int authorCount = 0;
        for (Book book : searchAuthor) {
            if (book.getAuthor().equals("Author#1")) {
                authorCount++;
            }
        }
        boolean result = (searchAuthor.size() == 4) && (authorCount == 4);
        assertTrue(result);
    }

    @Test
    public void findByAuthor_8_Not_Books_waiting_True() {
        List<Book> searchAuthor = demo.findByAuthor("Author#5");
        int authorCount = 0;
        for (Book book : searchAuthor) {
            if (book.getAuthor().equals("Author#5")) {
                authorCount++;
            }
        }
        boolean result = (searchAuthor.size() == 0) && (authorCount == 0);
        assertTrue(result);
    }
}