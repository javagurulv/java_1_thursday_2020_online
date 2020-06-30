package student_aleksey_kodin.lesson10.level6.task_23;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1", "Name#1");
    Book book_2 = new Book("Author#2", "Name#2");

    @Test
    public void unreadBooks_Check_One_Book_waiting_True() {
        bookReader.addBook(book_1);

        boolean result = bookReader.unreadBooks(book_1);
        assertTrue(result);
    }

    @Test
    public void unreadBooks_Check_First_Book_waiting_True() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        boolean result = bookReader.unreadBooks(book_1);
        assertTrue(result);
    }

    @Test
    public void unreadBooks_Check_Second_Book_waiting_True() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        boolean result = bookReader.unreadBooks(book_2);
        assertTrue(result);
    }

    @Test
    public void unreadBooks_Second_Book_Not_Exist_waiting_False() {
        bookReader.addBook(book_1);

        boolean result = bookReader.unreadBooks(book_2);
        assertFalse(result);
    }
}