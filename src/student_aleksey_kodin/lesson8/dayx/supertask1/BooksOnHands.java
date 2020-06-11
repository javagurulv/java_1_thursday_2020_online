package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.util.ArrayList;
import java.util.List;

class BooksOnHands {
    List<Book> bookOnHands = new ArrayList<>();
    List<Reader> readerWhoTakeBook = new ArrayList<>();
    List<DatesUsingBook> datesUsingBooks = new ArrayList<>();

    BooksOnHands(Reader reader,Book book,DatesUsingBook date) {
        readerWhoTakeBook.add(reader);
        bookOnHands.add(book);
        datesUsingBooks.add(date);
    }
}
