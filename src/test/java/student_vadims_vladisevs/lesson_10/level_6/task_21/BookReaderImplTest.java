package student_vadims_vladisevs.lesson_10.level_6.task_21;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void findByTitleV1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book("Ray Bradbury", "Dandelion Wine");
        Book fifthBook = new Book("Ray Bradbury", "The Martian Chronicles");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(fourthBook, library);
        bookReader.addBookToLibrary(fifthBook, library);

        ArrayList<Book> list = bookReader.findByTitle("1", library);

        assertEquals("Fahrenheit 451", list.get(0).getTitle());
    }

    @Test
    public void findByTitleV2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book("Ray Bradbury", "Dandelion Wine");
        Book fifthBook = new Book("Ray Bradbury", "The Martian Chronicles");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(fourthBook, library);
        bookReader.addBookToLibrary(fifthBook, library);

        ArrayList<Book> list = bookReader.findByTitle("1", library);

        assertEquals("1984", list.get(1).getTitle());
    }

    @Test
    public void findByTitleV3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book("Ray Bradbury", "Dandelion Wine");
        Book fifthBook = new Book("Ray Bradbury", "The Martian Chronicles");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(fourthBook, library);
        bookReader.addBookToLibrary(fifthBook, library);

        ArrayList<Book> list = bookReader.findByTitle("1", library);

        assertEquals(2, list.size());
    }
}