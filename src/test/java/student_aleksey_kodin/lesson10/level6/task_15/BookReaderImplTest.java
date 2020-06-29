package student_aleksey_kodin.lesson10.level6.task_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book(null, "Book#1");
    Book book_2 = new Book("Author#2", null);
    Book book_3 = new Book(null, null);
    Book book_4 = new Book(" ", null);
    Book book_5 = new Book(null, " ");
    Book book_6 = new Book(" ", "Book#1");
    Book book_7 = new Book("Author#2", " ");
    Book book_8 = new Book("", "");
    Book book_9 = new Book(" ", " ");
    Book book_10 = new Book("Author", "Name");

    @Test
    public void addBook_Book_Author_Null_waiting_False() {
        boolean result = bookReader.addBook(book_1);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Name_Null_waiting_False() {
        boolean result = bookReader.addBook(book_2);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Name_and_Author_Null_waiting_False() {
        boolean result = bookReader.addBook(book_3);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Author_One_Space_Book_Name_Null_waiting_False() {
        boolean result = bookReader.addBook(book_4);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Author_Null_Book_Name_One_Space_waiting_False() {
        boolean result = bookReader.addBook(book_5);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Author_One_Space_Book_Name_Correct_waiting_False() {
        boolean result = bookReader.addBook(book_6);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Author_Correct_Book_Name_One_Space_waiting_False() {
        boolean result = bookReader.addBook(book_7);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Author_and_Book_Name_Empty_Without_Space_waiting_False() {
        boolean result = bookReader.addBook(book_8);

        assertFalse(result);
    }

    @Test
    public void addBook_Book_Author_One_Space_Book_Name_One_Space_waiting_False() {
        boolean result = bookReader.addBook(book_9);

        assertFalse(result);
    }

    @Test
    public void addBook_Correct_waiting_True() {
        boolean result = bookReader.addBook(book_10);

        assertTrue(result);
    }
}