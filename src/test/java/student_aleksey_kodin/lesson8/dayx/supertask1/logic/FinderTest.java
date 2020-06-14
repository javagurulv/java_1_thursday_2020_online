package student_aleksey_kodin.lesson8.dayx.supertask1.logic;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Reader;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class FinderTest {
        Library library = new Library();
        Reader reader_1 = new Reader("UserName 1","UserSurname 1");
        Book book_1 = new Book("Book Author 1","Book Name 1");
        DatesUsingBook datesUsingBook = new DatesUsingBook();
    @Before
    public void startUp() {
        library.addBook(book_1);
        library.addReader(reader_1);
        library.setBookReservation(reader_1, book_1);

        datesUsingBook.setDateWhenTakeBook(2020,6,20);
        datesUsingBook.setDateWhenReturnBook(15);
    }

    @Test
    public void isBookInLibrary() {
        boolean result = Finder.isBookInLibrary(library, book_1);
        assertTrue(result);
    }

    @Test
    public void isBookReserve() {
        boolean result = Finder.isBookReserve(library, book_1);
        assertTrue(result);
    }

    @Test
    public void isReaderInLibrary() {
        boolean result = Finder.isReaderInLibrary(library, reader_1);
        assertTrue(result);
    }

    @Test
    public void isReaderReserveBook() {
        boolean result = Finder.isReaderReserveBook(library, reader_1);
        assertTrue(result);
    }

    @Test
    public void isBookTaken() {
        library.cancelBookReservation(reader_1, book_1);
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        boolean result = Finder.isReaderBookTaken(library, reader_1);
        assertTrue(result);
    }

    @Test
    public void findReaderReservedBook() {
        library.setBookReservation(reader_1, book_1);
        Reader finderReader = Finder.findReaderReservedBook(library,book_1);
        assert finderReader != null;
        assertEquals("UserName 1",finderReader.getClientName());
    }

    @Test
    public void findBookReservedReader() {
        library.setBookReservation(reader_1, book_1);
        Book finderBook = Finder.findBookReservedReader(library,reader_1);
        assert finderBook != null;
        assertEquals("Book Author 1",finderBook.getAuthor());
    }

    @Test
    public void isReaderBookTaken() {
        library.cancelBookReservation(reader_1,book_1);
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        boolean result = Finder.isReaderBookTaken(library, reader_1);
        assertTrue(result);
    }

    @Test
    public void getAllBooksForReader() {
        library.cancelBookReservation(reader_1,book_1);
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        List<Book> bookList = Finder.getAllBooksForReader(library, reader_1);
        assertEquals(1,bookList.size());
    }

    @Test
    public void getStartDateForBook() {
        library.cancelBookReservation(reader_1,book_1);
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate result = Finder.getStartDateForBook(library,book_1);
        LocalDate waitingResult = LocalDate.of(2020,6,20);
        assertEquals(waitingResult,result);
    }

    @Test
    public void getFinishDateForBook() {
        library.cancelBookReservation(reader_1,book_1);
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate result = Finder.getFinishDateForBook(library,book_1);
        LocalDate waitingResult = LocalDate.of(2020,7,5);
        assertEquals(waitingResult,result);
    }

    @Test
    public void isReaderNoReturnBook() {
        library.cancelBookReservation(reader_1,book_1);
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate datePattern = LocalDate.of(2020,7,6);
        Boolean result = Finder.isReaderNoReturnBook(library,reader_1,datePattern);
        assertTrue(result);
    }
}