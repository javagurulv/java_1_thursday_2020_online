package student_aleksey_kodin.lesson8.dayx.supertask1.logic;

import student_aleksey_kodin.lesson8.dayx.supertask1.domain.*;

public  class Finder {
    public static boolean isBookInLibrary(Library library, Book book) {
        return library.booksInLibrary.containsKey(book);
    }
    public static boolean isBookReserve(Library library, Book book) {
        return library.booksInLibrary.get(book).equals(BookReservation.YES);
    }
    public static boolean isReaderInLibrary(Library library, Reader reader) {
        return library.readersInLibrary.containsKey(reader);
    }
    public static boolean isReaderReserveBook(Library library, Reader reader) {
        return library.readerReserveBook.get(reader).equals(BookReservation.YES);
    }
    public static boolean isBookTaken(Library library, Reader reader) {
        return library.readersInLibrary.get(reader).equals(TakeBook.YES);
    }
}
