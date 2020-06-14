package student_aleksey_kodin.lesson8.dayx.supertask1;

import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Reader;
import student_aleksey_kodin.lesson8.dayx.supertask1.logic.*;

import java.time.LocalDate;
import java.util.List;


class Demo {
    public static void main(String[] args) {
        Library library = new Library();

        Reader reader = new Reader("Alex", "Petrov");
        Reader reader1 = new Reader("User", "Unknown");

        Book book_1 = new Book("Tolstoy", "War and Peace");
        Book book_2 = new Book("Chehov", "Roman");

        library.addBook(book_1);
        library.addBook(book_2);

        library.addReader(reader);
        library.addReader(reader1);

        DatesUsingBook dates1 = new DatesUsingBook();
        dates1.setDateWhenTakeBook(2020, 6, 20);
        dates1.setDateWhenReturnBook(15);
        library.readerTakeBook(library, reader, book_1, dates1);

        DatesUsingBook dates2 = new DatesUsingBook();
        dates2.setDateWhenTakeBook(2020, 6, 30);
        dates2.setDateWhenReturnBook(20);
        library.readerTakeBook(library, reader, book_2, dates2);

        LocalDate datePattern = LocalDate.of(2020, 7, 5);
        System.out.println(Finder.isReaderNoReturnBook(library,reader,datePattern));
    }
}
