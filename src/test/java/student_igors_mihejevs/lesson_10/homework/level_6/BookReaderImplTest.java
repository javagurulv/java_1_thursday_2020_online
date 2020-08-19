package student_igors_mihejevs.lesson_10.homework.level_6;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void shouldReturnTrueIfBookIsInELibraryAndMarkedAsNotRead () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book);
        assertTrue(bookReader.MarkBookAsNotRead(new Book("Clean Code", "Robert C. Martin")));
        assertFalse(bookReader.eLibrary.get(0).isAlreadyRead());
    }

    @Test
    public void shouldReturnTrueIfBookIsInELibraryAndMarkedAsRead () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book);
        assertTrue(bookReader.MarkBookAsAlreadyRead(new Book("Clean Code", "Robert C. Martin")));
        assertTrue(bookReader.eLibrary.get(0).isAlreadyRead());
    }

    @Test
    public void shouldReturnFalseIfBookIsNotInELibrary () {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book = new Book("Clean Code", "Robert C. Martin");
        bookReader.addBook(book);
        assertFalse(bookReader.MarkBookAsAlreadyRead(new Book("Head First Java", "Kathy Sierra, Bert Bates")));
    }


    @Test
    public void shouldFindBooksByPartOfTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.addBook(new Book("Head First Java", "Kathy Sierra, Bert Bates"));
        List<Book> actualBooks = bookReader.listByTitleOrContainsPartOfTitle("Head");
        assertEquals("Head First Java", actualBooks.get(0).getBookTitle());
    }

    @Test
    public void shouldFindBooksByTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.addBook(new Book("Head First Java", "Kathy Sierra, Bert Bates"));
        List<Book> actualBooks = bookReader.listByTitleOrContainsPartOfTitle("Head First Java");
        assertEquals("Head First Java", actualBooks.get(0).getBookTitle());
    }

    @Test
    public void shouldFindBooksByPartOfAuthorName() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.addBook(new Book("Head First Java", "Kathy Sierra, Bert Bates"));
        List<Book> actualBooks = bookReader.listByAuthorOrContainsPartOfAuthorName("Sierra");
        assertEquals("Kathy Sierra, Bert Bates", actualBooks.get(0).getBookAuthor());
    }

    @Test
    public void shouldFindBooksByAuthor() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.addBook(new Book("Head First Java", "Kathy Sierra, Bert Bates"));
        List<Book> actualBooks = bookReader.listByAuthorOrContainsPartOfAuthorName("Kathy Sierra, Bert Bates");
        assertEquals("Kathy Sierra, Bert Bates", actualBooks.get(0).getBookAuthor());
    }

    @Test
    public void shouldListAllReadBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.eLibrary.get(0).setAlreadyRead(true);
        String[] books = {"Clean Code [Robert C. Martin]"};
        assertArrayEquals(books, bookReader.listOfAllReadBooks());
    }

    @Test
    public void shouldListAllNotReadBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.eLibrary.get(0).setAlreadyRead(false);
        String[] books = {"Clean Code [Robert C. Martin]"};
        assertArrayEquals(books, bookReader.listOfAllNotReadBooks());
    }

    @Test
    public void shouldListAllBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookReader.addBook(new Book("Head First Java", "Kathy Sierra, Bert Bates"));
        String[] books = {"Clean Code [Robert C. Martin]", "Head First Java [Kathy Sierra, Bert Bates]"};
        assertArrayEquals(books, bookReader.listOfAllBooks());
    }

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