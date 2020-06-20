package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Finder {
    public static boolean isBookInLibrary(Library library, Book book) {
        return library.booksInLibrary.containsKey(book);
    }

    public static boolean isReaderInLibrary(Library library, Reader reader) {
        return library.readersInLibrary.containsKey(reader);
    }

    public static boolean isBookReserve(Library library, Book book) {
        return library.booksInLibrary.get(book).equals(BookReservation.YES);
    }

    public static boolean isBookTaken(Library library, Book book) {
        List<Book> readerTakenBooks;
        Set<Reader> setReadersKeys = library.readersWhoTakeBooks.keySet();

        for (Reader searchReader : setReadersKeys) {
            readerTakenBooks = getAllBooksForReader(library, searchReader);
            for (Book readerTakenBook : readerTakenBooks) {
                if (readerTakenBook.equals(book)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Reader findReaderReservedBook(Library library, Book book) {
        Set<Reader> setReadersKeys = library.reservationsBooks.keySet();
        for (Reader reader : setReadersKeys) {
            if (library.reservationsBooks.get(reader).equals(book)) {
                return reader;
            }
        }
        return null;
    }

    public static Book findBookReservedReader(Library library, Reader reader) {
        Set<Reader> setReadersKeys = library.reservationsBooks.keySet();
        for (Reader searchReader : setReadersKeys) {
            if (searchReader.equals(reader)) {
                return library.reservationsBooks.get(searchReader);
            }
        }
        return null;
    }

    public static boolean isReaderReserveBook(Library library, Reader reader) {
        Set<Reader> setReadersKeys = library.reservationsBooks.keySet();
        for (Reader searchReader : setReadersKeys) {
            if (searchReader.equals(reader)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isReaderBookTaken(Library library, Reader reader) {
        return library.readersInLibrary.get(reader).equals(TakeBook.YES);
    }

    public static boolean isReaderTakenCurrentBook(Library library, Reader reader, Book book) {
        List<Book> readerBooks = getAllBooksForReader(library, reader);
        return readerBooks.contains(book);
    }

    public static List<Book> getAllBooksForReader(Library library, Reader reader) {
        List<Book> readerTakeBooks = new ArrayList<>();
        Set<Reader> setReadersKeys = library.readersWhoTakeBooks.keySet();

        for (Reader searchReader : setReadersKeys) {
            if (searchReader.equals(reader)) {
                int size = library.readersWhoTakeBooks.get(searchReader).size();
                for (int i = 0; i < size; i++) {
                    readerTakeBooks.add(library.readersWhoTakeBooks.get(searchReader).get(i));
                }
            }
        }
        return readerTakeBooks;
    }

    public static LocalDate getStartDateForBook(Library library, Book book) {
        Set<Book> setBooksKeys = library.dateUsingBook.keySet();
        Book currentBook = null;
        for (Book searchBook : setBooksKeys) {
            if (searchBook.equals(book)) {
                currentBook = searchBook;
                break;
            }
        }
        return library.dateUsingBook.get(currentBook).getFirstDateReadBook();
    }

    public static LocalDate getFinishDateForBook(Library library, Book book) {
        Set<Book> setBooksKeys = library.dateUsingBook.keySet();
        Book currentBook = null;
        for (Book searchBook : setBooksKeys) {
            if (searchBook.equals(book)) {
                currentBook = searchBook;
                break;
            }
        }
        return library.dateUsingBook.get(currentBook).getLastDateReadBook();
    }
}
