package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book = new Book("Author's name","Book's name");

    @Test
    public void getBookName() {
        String result = book.getAuthor();
        assertEquals("Author's name",result);
    }

    @Test
    public void getAuthor() {
        String result = book.getBookName();
        assertEquals("Book's name",result);
    }
}