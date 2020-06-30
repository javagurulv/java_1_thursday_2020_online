package student_aleksey_kodin.lesson10.level6.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1", "Name#1");
    Book book_2 = new Book("Author#2", "Name#2");
    Book book_3 = new Book("Author#3", "Name#3");


    @Test
    public void createBookList_Check_Length() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        String[] result = bookReader.createBookList();
        int length = result.length;

        assertEquals(3, length);
    }

    @Test
    public void createBookList_One_Records_Check_First_Record() {
        bookReader.addBook(book_1);
        String[] result = bookReader.createBookList();
        String secondRecord = result[0];

        assertEquals("Name#1" + " [" + "Author#1" + "]", secondRecord);
    }

    @Test
    public void createBookList_Two_Records_Check_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        String[] result = bookReader.createBookList();
        String secondRecord = result[1];

        assertEquals("Name#2" + " [" + "Author#2" + "]", secondRecord);
    }

    @Test
    public void createBookList_Three_Records_Check_Third_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        String[] result = bookReader.createBookList();
        String secondRecord = result[2];

        assertEquals("Name#3" + " [" + "Author#3" + "]", secondRecord);
    }

    @Test
    public void createBookList_Three_Records_Check_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);
        bookReader.addBook(book_3);
        String[] result = bookReader.createBookList();
        String secondRecord = result[0];

        assertEquals("Name#1" + " [" + "Author#1" + "]", secondRecord);
    }
}