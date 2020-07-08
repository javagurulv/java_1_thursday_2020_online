package student_vadims_vladisevs.lesson_10.level_6.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void addBookToLibraryV1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");

        Library library = new Library();

        boolean actual = bookReader.addBookToLibrary(firstBook, library);
        assertTrue(actual);
    }

    @Test
    public void addBookToLibraryV2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");

        Library library = new Library();

        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook,library);

        boolean actual = bookReader.addBookToLibrary(firstBook, library);
        assertTrue(actual);
    }

    @Test
    public void addBookToLibraryV3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");

        Library library = new Library();

        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook,library);
        bookReader.addBookToLibrary(firstBook,library);

        boolean actual = bookReader.addBookToLibrary(firstBook, library);
        assertFalse(actual);
    }

    @Test
    public void addBookToLibraryV4() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");

        Library library = new Library();

        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook,library);
        bookReader.addBookToLibrary(firstBook,library);

        boolean actual = bookReader.addBookToLibrary(secondBook, library);
        assertFalse(actual);
    }
}