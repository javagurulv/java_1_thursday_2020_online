package student_aleksey_kodin.lesson8.dayx.supertask1.logic;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Reader;

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
        boolean result = Finder.isBookTaken(library, reader_1);
        assertTrue(result);
    }
}