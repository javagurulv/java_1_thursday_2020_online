package student_aleksey_kodin.lesson10.level6.task_21;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1", "Name#1");
    Book book_2 = new Book("Author#2", "Name#2");


    @Test
    public void searchForBooksByTitle_Check_Length() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);


        List<Book> result = bookReader.searchForBooksByTitle("Name#1");

        int length = result.size();
        assertEquals(1, length);
    }

    @Test
    public void searchForBooksByTitle_Check_First_Book() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("Name#1");

        assertEquals("Name#1", result.get(0).getBookName());
    }

    @Test
    public void searchForBooksByTitle_Check_Second_Book() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);


        List<Book> result = bookReader.searchForBooksByTitle("Name#2");

        assertEquals("Name#2", result.get(0).getBookName());
    }

    @Test
    public void searchForBooksByTitle_Check_Author_First_Book() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("Name#1");

        assertEquals("Author#1", result.get(0).getBookAuthor());
    }

    @Test
    public void searchForBooksByAuthor_Check_Author_Second_Book() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("Name#2");

        assertEquals("Author#2", result.get(0).getBookAuthor());
    }

    @Test
    public void searchForBooksByTitle_Use_Pattern_Check_Length() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("#1");

        int length = result.size();
        assertEquals(1, length);
    }

    @Test
    public void searchForBooksByTitle_Use_Pattern_Check_First_Book() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("#1");

        assertEquals("Name#1", result.get(0).getBookName());
    }

    @Test
    public void searchForBooksByTitle_Use_Pattern_Check_Second_Book() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("#2");

        assertEquals("Name#2", result.get(0).getBookName());
    }

    @Test
    public void searchForBooksByTitle_Use_Pattern_Check_Author_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);


        List<Book> result = bookReader.searchForBooksByTitle("#1");

        assertEquals("Author#1", result.get(0).getBookAuthor());
    }

    @Test
    public void searchForBooksByTitle_Use_Pattern_Check_Author_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        List<Book> result = bookReader.searchForBooksByTitle("#2");

        assertEquals("Author#2", result.get(0).getBookAuthor());
    }
}