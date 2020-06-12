package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.util.*;

class Library {

    List<Book> booksInLibrary = new ArrayList<>();
    List<Reader> readersInLibrary = new ArrayList<>();

    public void addBook(Book book) {
        booksInLibrary.add(book);
    }
    public void addReader(Reader reader) {
        readersInLibrary.add(reader);
    }
    public void readerTakeBook(Reader reader, Book book,DatesUsingBook datesUsingBook) {
        reader.takeBook(book,datesUsingBook);
    }
}