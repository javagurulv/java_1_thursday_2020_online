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

        Reader reader = new Reader("User1", "User Surname1");
        Reader reader1 = new Reader("User2", "Surname2");

        Book book_1 = new Book("Author1", "Book1");
        Book book_2 = new Book("Author2", "Book2");
        Book book_3 = new Book("Author3", "Book3");

        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);

        library.addReader(reader);
        library.addReader(reader1);

        DatesUsingBook dates2 = new DatesUsingBook();
        dates2.setDateWhenTakeBook(2020, 6, 20);
        dates2.setDateCountUntilReturnBook(15);

        DatesUsingBook dates3 = new DatesUsingBook();
        dates3.setDateWhenTakeBook(2020, 6, 20);
        dates3.setDateCountUntilReturnBook(15);

        DatesUsingBook dates1 = new DatesUsingBook();
        dates1.setDateWhenTakeBook(2020, 6, 20);
        dates1.setDateCountUntilReturnBook(15);
        LocalDate date = LocalDate.of(2020, 7,7 );
        library.penalty.setPenaltySize(new BigDecimal("5"));

        library.readerTakeBook(library, reader, book_1, dates1);
        library.readerTakeBook(library, reader, book_2, dates1);
        library.readerTakeBook(library, reader1, book_3, dates3);


    }
}
