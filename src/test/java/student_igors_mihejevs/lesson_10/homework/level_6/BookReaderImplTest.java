package student_igors_mihejevs.lesson_10.homework.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnTrueIfBookIsNotInELibraryAndAddedCorrectly() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Clean Code", "Robert C. Martin");
        assertTrue(bookReader.addBook(book));
        assertEquals(book, bookReader.eLibrary.get(0));
    }

    @Test
    public void shouldReturnFalseIfBookAlreadyIsInELibrary () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book);
        assertFalse(bookReader.addBook(new Book("Clean Code", "Robert C. Martin")));
        assertEquals(book, bookReader.eLibrary.get(0));
    }

}