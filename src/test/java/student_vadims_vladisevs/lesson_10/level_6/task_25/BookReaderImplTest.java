package student_vadims_vladisevs.lesson_10.level_6.task_25;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void listOfNotCompletedBooksV1() {
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


        bookReader.completedRead(firstBook, library);
        bookReader.completedRead(secondBook, library);

        String[] list = bookReader.listOfNotCompletedBooks(library);

        assertEquals(3,list.length);
    }

    @Test
    public void listOfNotCompletedBooksV2() {
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


        bookReader.completedRead(firstBook, library);
        bookReader.completedRead(secondBook, library);

        String[] list = bookReader.listOfNotCompletedBooks(library);

        assertEquals("1984 [George Orwell]",list[0]);
    }

    @Test
    public void listOfNotCompletedBooksV3() {
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


        bookReader.completedRead(firstBook, library);
        bookReader.completedRead(secondBook, library);

        String[] list = bookReader.listOfNotCompletedBooks(library);

        assertEquals("Dandelion Wine [Ray Bradbury]",list[1]);
    }

    @Test
    public void listOfNotCompletedBooksV4() {
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


        bookReader.completedRead(firstBook, library);
        bookReader.completedRead(secondBook, library);

        String[] list = bookReader.listOfNotCompletedBooks(library);

        assertEquals("The Martian Chronicles [Ray Bradbury]",list[2]);
    }
}