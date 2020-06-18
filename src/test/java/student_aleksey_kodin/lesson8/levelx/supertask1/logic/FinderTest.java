package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class FinderTest {
        Library library = new Library();
        Reader reader_1 = new Reader("UserName 1","UserSurname 1");
        Reader reader_2 = new Reader("UserName 1","UserSurname 1");
        Book book_1 = new Book("Book Author 1","Book Name 1");
        Book book_2 = new Book("Book Author 1","Book Name 1");
        DatesUsingBook datesUsingBook = new DatesUsingBook();
    @Before
    public void setUp() {
        library.addBook(book_1);
        library.addReader(reader_1);

        datesUsingBook.setDateWhenTakeBook(2020,6,20);
        datesUsingBook.setDateCountUntilReturnBook(15);
    }

    @Test
    public void isBookInLibrary() {
        boolean result = Finder.isBookInLibrary(library, book_1);
        assertTrue(result);
    }

    @Test
    public void isBookReserve() {
        library.setBookReservation(reader_1, book_1);
        boolean result = Finder.isBookReserve(library, book_1);
        assertTrue(result);
    }

    @Test
    public void isBookTaken_waitingTrue() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        boolean result = Finder.isBookTaken(library,book_1);
        assertTrue(result);
    }

    @Test
    public void isBookTaken_waitingFalse() {
        boolean result = Finder.isBookTaken(library,book_1);
        assertFalse(result);
    }

    @Test
    public void isBookTaken_SecondReaders() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        library.readerTakeBook(library,reader_2,book_2,datesUsingBook);
        boolean result = Finder.isBookTaken(library,book_2);
        assertTrue(result);
    }

    @Test
    public void isReaderInLibrary() {
        boolean result = Finder.isReaderInLibrary(library, reader_1);
        assertTrue(result);
    }

    @Test
    public void isReaderReserveBook() {
        library.setBookReservation(reader_1, book_1);
        boolean result = Finder.isReaderReserveBook(library, reader_1);
        assertTrue(result);
    }

    @Test
    public void isReaderBookTaken() {
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
    public void getAllBooksForReader() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        List<Book> bookList = Finder.getAllBooksForReader(library, reader_1);
        assertEquals(1,bookList.size());
    }

    @Test
    public void getStartDateForBook() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate result = Finder.getStartDateForBook(library,book_1);
        LocalDate waitingResult = LocalDate.of(2020,6,20);
        assertEquals(waitingResult,result);
    }

    @Test
    public void getFinishDateForBook() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate result = Finder.getFinishDateForBook(library,book_1);
        LocalDate waitingResult = LocalDate.of(2020,7,5);
        assertEquals(waitingResult,result);
    }
    @Test()
    public void findReaderReservedBook_waitingEmptyList() {
        Reader finderReader = Finder.findReaderReservedBook(library,book_1);
        assertNull(finderReader);

    }
    @Test
    public void findBookReservedReader_waitingEmptyList() {
        Book finderBook = Finder.findBookReservedReader(library,reader_1);
        assertNull(finderBook);
    }
    @Test
    public void isReaderTakenCurrentBook() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        boolean result = Finder.isReaderTakenCurrentBook(library,reader_1,book_1);
        assertTrue(result);
    }
}