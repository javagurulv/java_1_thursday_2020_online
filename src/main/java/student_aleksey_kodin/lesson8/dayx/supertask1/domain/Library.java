package student_aleksey_kodin.lesson8.dayx.supertask1.domain;

import student_aleksey_kodin.lesson8.dayx.supertask1.logic.Finder;

import java.util.*;

public class Library {

    public Map <Reader, Book> reservationsBooks = new HashMap<>();
    public Map <Book, BookReservation> booksInLibrary = new HashMap<>();

    public Map <Reader, TakeBook> readersInLibrary = new HashMap<>();
    public Map <Reader, List<? extends Book>> readersWhoTakeBooks = new HashMap<>();
    public Map <Book, DatesUsingBook> dateUsingBook = new HashMap<>();
    public Map <Reader, Book> noReturnBooks= new HashMap<>();

    public void addBook(Book book) {
        booksInLibrary.put(book,BookReservation.NO);
    }
    public void deleteBook(Book book) {
        booksInLibrary.remove(book);
    }
    public void deleteReader(Reader reader) {
        readersInLibrary.remove(reader);
    }
    public void setBookReservation(Reader reader, Book book) {
        booksInLibrary.put(book,BookReservation.YES);
        reservationsBooks.put(reader,book);
    }

    public void cancelBookReservation(Reader reader, Book book) {
        booksInLibrary.put(book,BookReservation.NO);
        reservationsBooks.remove(reader);
    }

    public void addReader(Reader reader) {
        readersInLibrary.put(reader,TakeBook.NO);
    }

    public void readerTakeBook(Library library, Reader reader, Book book, DatesUsingBook newDatesUsingBook) {
        if (Finder.isBookReserve(library,book)) {
            return;
        }
        reader.readerBook.add(book);
        readersWhoTakeBooks.put(reader, reader.readerBook);
        dateUsingBook.put(book,newDatesUsingBook);
        readersInLibrary.put(reader,TakeBook.YES);
    }
}