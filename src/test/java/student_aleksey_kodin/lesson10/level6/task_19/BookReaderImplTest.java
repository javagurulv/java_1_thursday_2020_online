package student_aleksey_kodin.lesson10.level6.task_19;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1", "Name#1");
    Book book_2 = new Book("Author#1", "Name#2");
    Book book_3 = new Book("Author#1", "Name#3");
    Book book_4 = new Book("Author#2", "Name#4");
    Book book_5 = new Book("Author#2", "Name#5");

    @Test
    public void searchForBooksByAuthor_Check_Length() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        int length = result.size();
        assertEquals(3, length);
    }

    @Test
    public void searchForBooksByAuthor_Check_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        assertEquals("Name#1", result.get(0).getBookName());
    }

    @Test
    public void searchForBooksByAuthor_Check_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        assertEquals("Name#2", result.get(1).getBookName());
    }

    @Test
    public void searchForBooksByAuthor_Check_Third_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        assertEquals("Name#3", result.get(2).getBookName());
    }

    @Test
    public void searchForBooksByAuthor_Check_Author_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        assertEquals("Author#1", result.get(0).getBookAuthor());
    }

    @Test
    public void searchForBooksByAuthor_Check_Author_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        assertEquals("Author#1", result.get(1).getBookAuthor());
    }

    @Test
    public void searchForBooksByAuthor_Check_Author_Third_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("Author#1");

        assertEquals("Author#1", result.get(2).getBookAuthor());
    }

    @Test
    public void searchForBooksByAuthor_Use_Pattern_Check_Length() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("#2");

        int length = result.size();
        assertEquals(2, length);
    }

    @Test
    public void searchForBooksByAuthor_Use_Pattern_Check_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("#2");

        assertEquals("Name#4", result.get(0).getBookName());
    }

    @Test
    public void searchForBooksByAuthor_Use_Pattern_Check_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("#2");

        assertEquals("Name#5", result.get(1).getBookName());
    }

    @Test
    public void searchForBooksByAuthor_Use_Pattern_Check_Author_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("#2");

        assertEquals("Author#2", result.get(0).getBookAuthor());
    }

    @Test
    public void searchForBooksByAuthor_Use_Pattern_Check_Author_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        bookReader.addBook(book_4);
        bookReader.addBook(book_5);

        List<Book> result = bookReader.searchForBooksByAuthor("#2");

        assertEquals("Author#2", result.get(1).getBookAuthor());
    }
}