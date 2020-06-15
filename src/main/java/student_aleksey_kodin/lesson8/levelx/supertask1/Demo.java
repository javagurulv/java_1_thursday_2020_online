package student_aleksey_kodin.lesson8.levelx.supertask1;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.*;
import student_aleksey_kodin.lesson8.levelx.supertask1.logic.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        NotReturnedBooks notReturnedBooks = new NotReturnedBooks();
        Notification notification = new Notification();
        Penalty penalty = new Penalty();

        Reader reader = new Reader("User1", "User Surname1");
        Reader reader1 = new Reader("User2", "Surname2");

        Book book_1 = new Book("Author1", "Book1");
        Book book_2 = new Book("Author2", "Book2");
        Book book_3 = new Book("Author3", "Book3");

        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);

        library.addReader(reader);
        //library.addReader(reader1);

        DatesUsingBook dates1 = new DatesUsingBook();
        dates1.setDateWhenTakeBook(2020, 6, 20);
        dates1.setDateCountUntilReturnBook(15);
        library.readerTakeBook(library, reader, book_1, dates1);

        DatesUsingBook dates2 = new DatesUsingBook();
        dates2.setDateWhenTakeBook(2020, 6, 20);
        dates2.setDateCountUntilReturnBook(15);
        library.readerTakeBook(library, reader, book_2, dates2);

        DatesUsingBook dates3 = new DatesUsingBook();
        dates2.setDateWhenTakeBook(2020, 6, 30);
        dates2.setDateCountUntilReturnBook(20);
        //library.readerTakeBook(library, reader1, book_3, dates2);

        LocalDate date = LocalDate.of(2020, 7,7 );
        penalty.setPenaltySize(new BigDecimal("5"));

        System.out.println("Map before: " + library.readersInLibrary.toString());
        System.out.println("Hash code" + reader.hashCode());
        System.out.println("Reader penalty ");
        System.out.println("-----------------------------------");

        penalty.setReaderPenalty(library,reader,date);

        System.out.println("Map after: " + library.readersInLibrary.toString());
        System.out.println("Hash code" + reader.hashCode());
        System.out.println("Reader penalty ");

        library.readerReturnBook(library,reader,book_2);

        System.out.println("Map after: " + library.readersInLibrary.toString());

        library.readerReturnBook(library,reader,book_1);

        System.out.println("Map after: " + library.readersInLibrary.toString());
        System.out.println(Finder.isReaderBookTaken(library,reader));



    }
}
