package student_vadims_vladisevs.lesson_10.level_6.task_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void addBookToLibraryV1() {
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
        bookReader.addBookToLibrary(firstBook,library);
        boolean actual = bookReader.addBookToLibrary(fourthBook, library);
        assertFalse(actual);

    }

    @Test
    public void addBookToLibraryV2() {
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
        bookReader.addBookToLibrary(firstBook,library);
        boolean actual = bookReader.addBookToLibrary(fifthBook, library);
        assertFalse(actual);

    }

    @Test
    public void addBookToLibraryV3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book(null, "Brave New World");
        Book fifthBook = new Book("William Golding", null);

        Library library = new Library();

        boolean actual = bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);

        assertTrue(actual);

    }

    @Test
    public void addBookToLibraryV4() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book("", "Brave New World");
        Book fifthBook = new Book("William Golding", "");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(firstBook,library);
        boolean actual = bookReader.addBookToLibrary(fifthBook, library);
        assertFalse(actual);

    }

    @Test
    public void addBookToLibraryV5() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book("", "Brave New World");
        Book fifthBook = new Book("William Golding", "");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(firstBook,library);
        boolean actual = bookReader.addBookToLibrary(fourthBook, library);
        assertFalse(actual);

    }
}