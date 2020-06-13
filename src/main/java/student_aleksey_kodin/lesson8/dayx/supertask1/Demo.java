package student_aleksey_kodin.lesson8.dayx.supertask1;

import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.dayx.supertask1.domain.Reader;
import student_aleksey_kodin.lesson8.dayx.supertask1.logic.*;


class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        DatesUsingBook datesUsingBook = new DatesUsingBook();

        Reader reader = new Reader("Alex","Petrov");
        Reader reader1 = new Reader("User","Unknown");

        Book book_1 = new Book("Tolstoy","War and Peace");
        Book book_2 = new Book("Chehov","Roman");

        library.addBook(book_1);
        library.addBook(book_2);

        library.addReader(reader);
        library.addReader(reader1);

        library.setBookReservation(reader,book_1);

        datesUsingBook.setDateWhenTakeBook(2020,6,20);
        datesUsingBook.setDateWhenReturnBook(15);
        //library.readerTakeBook(library,reader,book_1,datesUsingBook);

        datesUsingBook.setDateWhenTakeBook(2020,6,25);
        datesUsingBook.setDateWhenReturnBook(20);
        //library.readerTakeBook(library,reader,book_2,datesUsingBook);

        //PrintInformation.printAllBooks(library);
        //System.out.println(Finder.isBookInLibrary(library,book_2));

        //PrintInformation.printAllBookReaderTake(library,reader);
    }
}
