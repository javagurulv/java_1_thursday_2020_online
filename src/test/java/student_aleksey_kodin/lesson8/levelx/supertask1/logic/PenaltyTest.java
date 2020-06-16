package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class PenaltyTest {
    Library library = new Library();
    Reader reader_1 = new Reader("UserName 1","UserSurname 1");
    Reader reader_2 = new Reader("UserName 2","UserSurname 2");
    Book book_1 = new Book("Book Author 1","Book Name 1");
    Book book_2 = new Book("Book Author 2","Book Name 2");
    Book book_3 = new Book("Book Author 3","Book Name 3");
    Penalty penalty = new Penalty();

    @Before
    public void setUp() {
        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);

        library.addReader(reader_1);
        library.addReader(reader_2);

        penalty.setPenaltySize(new BigDecimal("5"));

        DatesUsingBook date_1 = new DatesUsingBook();
        date_1.setDateWhenTakeBook(2020,6,20);
        date_1.setDateCountUntilReturnBook(20);
        library.readerTakeBook(library,reader_1,book_1,date_1);

        DatesUsingBook date_2 = new DatesUsingBook();
        date_2.setDateWhenTakeBook(2020,7,2);
        date_2.setDateCountUntilReturnBook(20);
        library.readerTakeBook(library,reader_1,book_2,date_2);

        DatesUsingBook date_3 = new DatesUsingBook();
        date_3.setDateWhenTakeBook(2020,6,25);
        date_3.setDateCountUntilReturnBook(5);
        library.readerTakeBook(library,reader_2,book_3,date_3);
    }

    @Test
    public void getPenaltySize() {
        BigDecimal result = penalty.getPenaltySize();
        assertEquals(new BigDecimal("5"),result);
    }

    @Test
    public void setReaderPenalty_TwoBooks() {
        LocalDate datePattern = LocalDate.of(2020, 7,23 );
        penalty.setReaderPenalty(library,reader_1,datePattern);
        BigDecimal readerPenalty_1 = reader_1.getPenalty();
        assertEquals(new BigDecimal("10"),readerPenalty_1);
    }

    @Test
    public void setReaderPenalty_OneBooks() {
        LocalDate datePattern = LocalDate.of(2020, 7,11 );
        penalty.setReaderPenalty(library,reader_1,datePattern);
        BigDecimal readerPenalty_1 = reader_1.getPenalty();
        assertEquals(new BigDecimal("5"),readerPenalty_1);
    }

    @Test
    public void setReaderPenalty_NoBooksForPenalty() {
        LocalDate datePattern = LocalDate.of(2020, 7,1 );
        boolean result = penalty.setReaderPenalty(library,reader_1,datePattern);
        assertFalse(result);
        BigDecimal readerPenalty_1 = reader_1.getPenalty();
        assertEquals(new BigDecimal("0"),readerPenalty_1);
    }

    @Test
    public void setAllReadersPenalty() {
        LocalDate datePattern = LocalDate.of(2020, 7,23 );
        penalty.setAllReadersPenalty(library,datePattern);

        BigDecimal readerPenalty_1 = reader_1.getPenalty();
        assertEquals(new BigDecimal("10"),readerPenalty_1);

        BigDecimal readerPenalty_2 = reader_2.getPenalty();
        assertEquals(new BigDecimal("5"),readerPenalty_2);
    }
    @Test
    public void setAllReadersPenalty_PenaltyOnlyReader_2() {
        LocalDate datePattern = LocalDate.of(2020, 7,1 );
        penalty.setAllReadersPenalty(library,datePattern);

        BigDecimal readerPenalty_1 = reader_1.getPenalty();
        assertEquals(new BigDecimal("0"),readerPenalty_1);

        BigDecimal readerPenalty_2 = reader_2.getPenalty();
        assertEquals(new BigDecimal("5"),readerPenalty_2);
    }
}