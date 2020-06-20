package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.BookReservation;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;

public class PrintInformation {

    public static void printBookReservation(Library library) {
        for (Book book : library.booksInLibrary.keySet()) {
            if (library.booksInLibrary.get(book).equals(BookReservation.YES)) {
                System.out.println("Book: " + book.getAuthor() + " " + book.getBookName());
            }
        }
    }

    public static void printAllBooks(Library library) {
        for (Book book : library.booksInLibrary.keySet()) {
            System.out.println("Book: " + book.getAuthor() + " " + book.getBookName());
        }
    }

    public static void printAllBookReaderTaken(Library library, Reader reader) {
        try {
            for (Book book : library.readersWhoTakeBooks.get(reader)) {
                System.out.println("Book: " + book.getAuthor() + " " + book.getBookName());
            }
        } catch (NullPointerException e) {
            System.out.println("Records no found for reader: " + reader.getClientName() + " " + reader.getClientSurname());
        }
    }
}
