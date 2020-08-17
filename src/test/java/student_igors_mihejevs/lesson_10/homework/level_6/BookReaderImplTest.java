package student_igors_mihejevs.lesson_10.homework.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnTrueIfBookIsInELibraryAndItCorrectlyDeleted() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book1);
        assertTrue(bookReader.removeBook(book1));
    }

    @Test
    public void shouldReturnFalseIfBookIsNotInELibraryAndNotDeleted() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book1);
        assertFalse(bookReader.removeBook(new Book("Head First Java", "Kathy Sierra, Bert Bates")));
        assertEquals(book1, bookReader.eLibrary.get(0));
    }

    @Test
    public void shouldReturnTrueIfBookIsNotInELibraryOrAuthorIsNotBlankOrTitleIsNotBlankAndItAddedCorrectly() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Head First Java", "Kathy Sierra, Bert Bates");
        assertTrue(bookReader.addBook(book1));
        assertTrue(bookReader.addBook(book2));
        assertEquals(book1, bookReader.eLibrary.get(0));
        assertEquals(book2, bookReader.eLibrary.get(1));
    }

    @Test
    public void shouldReturnFalseIfBookAlreadyIsInELibrary () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book);
        assertFalse(bookReader.addBook(new Book("Clean Code", "Robert C. Martin")));
    }

    @Test
    public void shouldReturnFalseIfBookTitleIsBlank () {
        BookReaderImpl bookReader = new BookReaderImpl();
        assertFalse(bookReader.addBook(new Book("", "Robert C. Martin")));
    }

    @Test
    public void shouldReturnFalseIfBookAuthorIsBlank () {
        BookReaderImpl bookReader = new BookReaderImpl();
        assertFalse(bookReader.addBook(new Book("Clean Code", "")));
    }

}