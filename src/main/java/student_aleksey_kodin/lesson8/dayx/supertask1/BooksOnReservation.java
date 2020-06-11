package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.util.ArrayList;
import java.util.List;

class BooksOnReservation {
    List<Reader> readerWhoReserve = new ArrayList<>();
    List<Book> bookForReservation = new ArrayList<>();

    BooksOnReservation(Reader reader, Book book) {
        readerWhoReserve.add(reader);
        bookForReservation.add(book);
    }
}
