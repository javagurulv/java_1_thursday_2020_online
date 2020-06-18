package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import java.time.LocalDate;
import java.util.Objects;

public class DatesUsingBook {
    private LocalDate firstDateReadBook = LocalDate.now();
    private LocalDate lastDateReadBook = LocalDate.now();

    public void setDateWhenTakeBook(int year, int month, int dayOfMonth) {
        firstDateReadBook = LocalDate.of(year, month, dayOfMonth);
    }

    public void setDateCountUntilReturnBook(int dayOffset) {
        lastDateReadBook = getFirstDateReadBook().plusDays(dayOffset);
    }

    public LocalDate getFirstDateReadBook() {
        return firstDateReadBook;
    }

    public LocalDate getLastDateReadBook() {
        return lastDateReadBook;
    }

    public int getCurrentYearFromFirstDateReadBook() {
        return getFirstDateReadBook().getYear();
    }

    public int getCurrentMonthFromFirstDateReadBook() {
        return getFirstDateReadBook().getMonthValue();
    }

    public int getCurrentDateFromFirstDateReadBook() {
        return getFirstDateReadBook().getDayOfMonth();
    }

    public int getCurrentYearFromLastDateReadBook() {
        return getLastDateReadBook().getYear();
    }

    public int getCurrentMonthFromLastDateReadBook() {
        return getLastDateReadBook().getMonthValue();
    }

    public int getCurrentDateFromLastDateReadBook() {
        return getLastDateReadBook().getDayOfMonth();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatesUsingBook that = (DatesUsingBook) o;
        return firstDateReadBook.equals(that.firstDateReadBook) &&
                lastDateReadBook.equals(that.lastDateReadBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstDateReadBook, lastDateReadBook);
    }
}
