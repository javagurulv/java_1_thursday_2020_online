package student_vadims_vladisevs.lesson_10.level_6.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void listOfBookV1() {
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

        String[] list = bookReader.listOfBook(library);
        assertEquals("Fahrenheit 451 [Ray Bradbury]", list[0]);
    }

    @Test
    public void listOfBookV2() {
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

        String[] list = bookReader.listOfBook(library);
        assertEquals("We [Yevgeny Zamyatin]", list[1]);
    }

    @Test
    public void listOfBookV3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");


        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);

        String[] list = bookReader.listOfBook(library);
        assertEquals("1984 [George Orwell]", list[2]);
    }

    @Test
    public void listOfBookV4() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);

        String[] list = bookReader.listOfBook(library);
        assertEquals(3, list.length);
    }
}