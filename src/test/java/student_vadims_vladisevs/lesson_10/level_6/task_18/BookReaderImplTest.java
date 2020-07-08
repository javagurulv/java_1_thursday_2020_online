package student_vadims_vladisevs.lesson_10.level_6.task_18;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void findByAuthorV1() {
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

        ArrayList<Book> list = bookReader.findByAuthor("Ray Bradbury", library);

        assertEquals("Ray Bradbury", list.get(0).getAuthor());
    }

    @Test
    public void findByAuthorV2() {
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

        ArrayList<Book> list = bookReader.findByAuthor("Ray Bradbury", library);

        assertEquals("Ray Bradbury", list.get(1).getAuthor());
    }

    @Test
    public void findByAuthorV3() {
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

        ArrayList<Book> list = bookReader.findByAuthor("Ray Bradbury", library);

        assertEquals("Ray Bradbury", list.get(2).getAuthor());
    }

    @Test
    public void findByAuthorV4() {
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

        ArrayList<Book> list = bookReader.findByAuthor("Ray Bradbury", library);

        assertEquals(3, list.size());
    }
}