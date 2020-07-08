package student_vadims_vladisevs.lesson_10.level_6.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void removeBookFromLibraryV1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book(null, "Brave New World");
        Book fifthBook = new Book("William Golding", null);

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);

        boolean actual = bookReader.removeBookFromLibrary(thirdBook,library);
        assertTrue(actual);

    }

    @Test
    public void removeBookFromLibraryV2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book(null, "Brave New World");
        Book fifthBook = new Book("William Golding", null);

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);

        boolean actual = bookReader.removeBookFromLibrary(fourthBook,library);
        assertFalse(actual);

    }
}