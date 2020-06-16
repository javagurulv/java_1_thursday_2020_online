package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;


public class NotificationTest {
    Library library = new Library();
    Reader reader_1 = new Reader("UserName 1","UserSurname 1");
    Book book_1 = new Book("Book Author 1","Book Name 1");
    Book book_2 = new Book("Book Author 2","Book Name 2");
    Book book_3 = new Book("Book Author 3","Book Name 3");
    Notification notification = new Notification();

    @Before
    public void setUp() {
        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);
        library.addReader(reader_1);
    }

    @Test
    public void createMessage_NoBooks() {
        String message = notification.createMessage(library,reader_1);
        notification.sendMessage(message);
        System.out.println("------------------------------");
    }

    @Test
    public void createMessage_TwoBooks() {
        DatesUsingBook date_1 = new DatesUsingBook();
        date_1.setDateWhenTakeBook(2020,6,20);
        date_1.setDateCountUntilReturnBook(20);
        library.readerTakeBook(library,reader_1,book_1,date_1);

        DatesUsingBook date_2 = new DatesUsingBook();
        date_2.setDateWhenTakeBook(2020,7,2);
        date_2.setDateCountUntilReturnBook(20);
        library.readerTakeBook(library,reader_1,book_2,date_2);

        String message = notification.createMessage(library,reader_1);
        notification.sendMessage(message);
        System.out.println("------------------------------");
    }
    @Test
    public void createMessage_ThreeBooks() {
        DatesUsingBook date_1 = new DatesUsingBook();
        date_1.setDateWhenTakeBook(2020,6,20);
        date_1.setDateCountUntilReturnBook(20);
        library.readerTakeBook(library,reader_1,book_1,date_1);

        DatesUsingBook date_2 = new DatesUsingBook();
        date_2.setDateWhenTakeBook(2020,7,2);
        date_2.setDateCountUntilReturnBook(20);
        library.readerTakeBook(library,reader_1,book_2,date_2);

        DatesUsingBook date_3 = new DatesUsingBook();
        date_3.setDateWhenTakeBook(2020,7,12);
        date_3.setDateCountUntilReturnBook(15);
        library.readerTakeBook(library,reader_1,book_3,date_3);

        String message = notification.createMessage(library,reader_1);
        notification.sendMessage(message);
    }
}