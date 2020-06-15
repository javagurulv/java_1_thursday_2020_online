package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.levelx.supertask1.logic.Finder;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library = new Library();
    Book book_1 = new Book("Book Author 1","Book Name 1");
    Book book_2 = new Book("Book Author 2","Book Name 2");
    Reader reader_1 = new Reader("UserName 1","UserSurname 1");
    DatesUsingBook datesUsingBook = new DatesUsingBook();

    @Before
    public void setUp() {
        library.addBook(book_1);
        library.addBook(book_2);
        library.addReader(reader_1);
        datesUsingBook.setDateWhenTakeBook(2020,6,20);
        datesUsingBook.setDateCountUntilReturnBook(15);
    }

    @Test
    public void addBook() {
        boolean result = library.addBook(book_1);

        assertTrue(result);
    }

    @Test
    public void deleteBook() {
        boolean result = library.deleteBook(book_1);

        assertTrue(result);
    }

    @Test
    public void addReader() {
        boolean result = library.addReader(reader_1);

        assertTrue(result);
    }

    @Test
    public void deleteReader() {
        boolean result = library.deleteReader(reader_1);

        assertTrue(result);
    }

    @Test
    public void setBookReservation_checkBook() {
        library.setBookReservation(reader_1,book_1);
        boolean result = Finder.isBookReserve(library,book_1);

        assertTrue(result);
    }

    @Test
    public void setBookReservation_checkReader() {
        library.setBookReservation(reader_1,book_1);
        boolean result = Finder.isReaderReserveBook(library,reader_1);

        assertTrue(result);
    }

    @Test
    public void cancelBookReservation_checkBook() {
        library.cancelBookReservation(reader_1,book_1);
        boolean result = Finder.isBookReserve(library,book_1);

        assertFalse(result);
    }

    @Test
    public void cancelBookReservation_checkReader() {
        library.cancelBookReservation(reader_1,book_1);
        boolean result = Finder.isReaderReserveBook(library,reader_1);

        assertFalse(result);
    }

    @Test
    public void readerTakeBook_CantTakeReservedBook() {
        library.setBookReservation(reader_1,book_1);
        boolean result = library.readerTakeBook(library,reader_1,book_1,datesUsingBook);

        assertFalse(result);
    }

    @Test
    public void readerTakeBook() {
        boolean result = library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        boolean checkReader = Finder.isReaderBookTaken(library,reader_1);
        boolean checkCurrentBook = Finder.isReaderTakenCurrentBook(library,reader_1,book_1);

        assertTrue(result && checkReader && checkCurrentBook);
    }

    @Test
    public void readerReturnBook_TwoBooksOneDeleted() {
         library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
         library.readerTakeBook(library,reader_1,book_2,datesUsingBook);

        boolean result = library.readerReturnBook(library,reader_1,book_2);
        boolean checkCurrentBook = Finder.isReaderTakenCurrentBook(library,reader_1,book_2);

        assertTrue(result && !(checkCurrentBook));
    }

    @Test
    public void readerReturnBook_OneDeletedBookChangeTakenStatusToNo() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);

        boolean result = library.readerReturnBook(library,reader_1,book_1);
        boolean checkCurrentBook = Finder.isReaderTakenCurrentBook(library,reader_1,book_1);
        boolean checkTakenBookStatus = Finder.isReaderBookTaken(library,reader_1);

        assertTrue(result && !(checkCurrentBook) && !(checkTakenBookStatus));
    }
}