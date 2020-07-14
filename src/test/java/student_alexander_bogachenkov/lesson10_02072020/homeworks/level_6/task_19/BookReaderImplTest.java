package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnFirstFourLettersFromString() {
        BookReaderImpl bookReader = new BookReaderImpl();
        char[] actualArray = bookReader.getFirstFourLetters("Jules Verne");
        char[] expectedArray = {'j', 'u', 'l', 'e'};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void shouldFindSameBooksByAuthorFirstFourLetters() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Harry Potter", "J. K. Rowling"));
        bookReader.addBook(new Book("Clean Code", "Robert Martin"));
        bookReader.addBook(new Book("The Casual Vacancy", "J. K. Rowling"));
        bookReader.addBook(new Book("Harry Potter. Second Part", "J. K. Rowling"));
        bookReader.addBook(new Book("Children of Captain Grant", "Jules Verne"));
        List<Book> actual = bookReader.findBooksByAuthor("J K Row");
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("Harry Potter", "J. K. Rowling"));
        expected.add(new Book("The Casual Vacancy", "J. K. Rowling"));
        expected.add(new Book("Harry Potter. Second Part", "J. K. Rowling"));
        assertEquals(expected, actual);
    }

}