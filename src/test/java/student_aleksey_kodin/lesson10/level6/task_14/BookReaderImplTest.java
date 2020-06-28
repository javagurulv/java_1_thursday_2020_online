package student_aleksey_kodin.lesson10.level6.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1", "Book#1");
    Book book_2 = new Book("Author#2", "Book#2");

    @Test
    public void addBook_waiting_True() {
        boolean result = bookReader.addBook(book_1);
        assertTrue(result);
    }

    @Test
    public void addBook_waiting_False() {
        bookReader.addBook(book_1);
        boolean result = bookReader.addBook(book_1);
        assertFalse(result);
    }

    @Test
    public void add_Second_Book_waiting_True() {
        bookReader.addBook(book_1);
        boolean result = bookReader.addBook(book_2);
        assertTrue(result);
    }

    @Test
    public void add_Two_Books_Try_Add_Second_Book_Again_waiting_False() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        boolean result = bookReader.addBook(book_2);
        assertFalse(result);
    }
}