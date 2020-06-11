package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.time.LocalDate;
import java.util.Objects;

class DatesUsingBook {
    private LocalDate firstDateReadBook;
    private LocalDate lastDateReadBook;

    public void setDateWhenTakeBook(int year, int month, int dayOfMonth) {
        firstDateReadBook = LocalDate.of(year,month,dayOfMonth);
    }
    public void setDateWhenReturnBook(int dayOffset) {
        lastDateReadBook = getFirstDateReadBook().plusDays(dayOffset);
    }
    public LocalDate getFirstDateReadBook() {
        return firstDateReadBook;
    }
    public LocalDate getLastDateReadBook() {

        return lastDateReadBook;
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
