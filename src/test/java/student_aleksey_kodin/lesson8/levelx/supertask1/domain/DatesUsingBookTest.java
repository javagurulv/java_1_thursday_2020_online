package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DatesUsingBookTest {
    DatesUsingBook datesUsingBook = new DatesUsingBook();

    @Before
    public void setUp() {
        datesUsingBook.setDateWhenTakeBook(2020,6,15);
        datesUsingBook.setDateCountUntilReturnBook(15);
    }

    @Test
    public void getFirstDateReadBook() {
        LocalDate result = datesUsingBook.getFirstDateReadBook();
        LocalDate datePattern = LocalDate.of(2020,6,15);
        assertEquals(datePattern,result);
    }

    @Test
    public void getLastDateReadBook() {
        LocalDate result = datesUsingBook.getLastDateReadBook();
        LocalDate datePattern = LocalDate.of(2020,6,30);
        assertEquals(datePattern,result);
    }

    @Test
    public void getCurrentYearFromFirstDateReadBook() {
        int result = datesUsingBook.getCurrentYearFromFirstDateReadBook();
        assertEquals(2020,result);
    }

    @Test
    public void getCurrentMonthFromFirstDateReadBook() {
        int result = datesUsingBook.getCurrentMonthFromFirstDateReadBook();
        assertEquals(6,result);
    }

    @Test
    public void getCurrentDateFromFirstDateReadBook() {
        int result = datesUsingBook.getCurrentDateFromFirstDateReadBook();
        assertEquals(15,result);
    }

    @Test
    public void getCurrentYearFromLastDateReadBook() {
        int result = datesUsingBook.getCurrentYearFromLastDateReadBook();
        assertEquals(2020,result);
    }

    @Test
    public void getCurrentMonthFromLastDateReadBook() {
        int result = datesUsingBook.getCurrentMonthFromLastDateReadBook();
        assertEquals(6,result);
    }

    @Test
    public void getCurrentDateFromLastDateReadBook() {
        int result = datesUsingBook.getCurrentDateFromLastDateReadBook();
        assertEquals(30,result);
    }
}