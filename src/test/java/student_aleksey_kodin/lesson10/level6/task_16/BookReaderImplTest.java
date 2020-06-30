package student_aleksey_kodin.lesson10.level6.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1","Name#1");
    Book book_2 = new Book("Author#2","Name#2");

    @Test
    public void deleteBook_waiting_True() {
        bookReader.addBook(book_1);
        boolean result = bookReader.deleteBook(book_1);

        assertTrue(result);
    }

    @Test
    public void deleteBook_Book_2_Not_Add_waiting_False() {
        bookReader.addBook(book_1);
        boolean result = bookReader.deleteBook(book_2);

        assertFalse(result);
    }
}