package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.util.ArrayList;
import java.util.List;

class Library {

    List<Book> booksInLibrary = new ArrayList<>();
    List<Reader> readersInLibrary = new ArrayList<>();
    List<BooksOnHands> booksOnHands = new ArrayList<>();
    List<BooksOnReservation> booksOnReservations = new ArrayList<>();

    public void addBook(Book book) {
        booksInLibrary.add(book);
    }
    public void addReader(Reader reader) {
        readersInLibrary.add(reader);
    }
    public void readerTakeBook(Reader reader, Book book, DatesUsingBook date) {
        booksOnHands.add(new BooksOnHands(reader,book,date));
    }
    public void addReservation(Reader reader,Book book) {
        booksOnReservations.add(new BooksOnReservation(reader,book));
    }
}