package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import org.junit.Before;
import org.junit.Test;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.DatesUsingBook;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.*;

public class NotReturnedBooksTest {
    Library library = new Library();
    Reader reader_1 = new Reader("UserName 1","UserSurname 1");
    Reader reader_2 = new Reader("UserName 2","UserSurname 2");
    Reader reader_3 = new Reader("UserName 3","UserSurname 3");
    Book book_1 = new Book("Book Author 1","Book Name 1");
    Book book_2 = new Book("Book Author 2","Book Name 2");
    Book book_3 = new Book("Book Author 3","Book Name 3");
    DatesUsingBook datesUsingBook = new DatesUsingBook();
    NotReturnedBooks notReturnedBooks = new NotReturnedBooks();

    @Before
    public void setUp() {
        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);

        library.addReader(reader_1);
        library.addReader(reader_2);
        library.addReader(reader_3);

        datesUsingBook.setDateWhenTakeBook(2020,6,20);
        datesUsingBook.setDateCountUntilReturnBook(15);
    }

    @Test
    public void createListBookNotReturnReaderCountIs_0() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate datePattern = LocalDate.of(2020,7,4);
        List<Book> listResult = notReturnedBooks.createListBookNotReturnReader(library,reader_1,datePattern);
        assertEquals(0,listResult.size());
    }

    @Test
    public void createListBookNotReturnReaderCountIs_1() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        LocalDate datePattern = LocalDate.of(2020,7,6);
        List<Book> listResult = notReturnedBooks.createListBookNotReturnReader(library,reader_1,datePattern);
        boolean result = (listResult.size() == 1) && listResult.get(0).getAuthor().equals("Book Author 1");
        assertTrue(result);
    }

    @Test
    public void createListBookNotReturnReaderCountIs_2() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        library.readerTakeBook(library,reader_1,book_2,datesUsingBook);
        LocalDate datePattern = LocalDate.of(2020,7,6);
        List<Book> listResult = notReturnedBooks.createListBookNotReturnReader(library,reader_1,datePattern);
        boolean result = (listResult.size() == 2) && listResult.get(0).getAuthor().equals("Book Author 1") &&
                          listResult.get(1).getAuthor().equals("Book Author 2");
        assertTrue(result);
    }

    @Test
    public void createListAllReadersNotReturnedBooks_EmptyList() {
        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        library.readerTakeBook(library,reader_2,book_2,datesUsingBook);
        library.readerTakeBook(library,reader_3,book_3,datesUsingBook);
        LocalDate datePattern = LocalDate.of(2020,7,4);
        boolean result = notReturnedBooks.createListAllReadersNotReturnedBooks(library,datePattern);
        boolean resultSize = !(notReturnedBooks.notReturnBooks.size() == 0);
        result = result && resultSize;
        assertFalse(result);
    }

    @Test
    public void createListAllReadersNotReturnedBooks() {
        AtomicBoolean resultBookAuthor = new AtomicBoolean(false);
        AtomicBoolean resultReaderName = new AtomicBoolean(false);

        library.readerTakeBook(library,reader_1,book_1,datesUsingBook);
        library.readerTakeBook(library,reader_2,book_2,datesUsingBook);
        library.readerTakeBook(library,reader_3,book_3,datesUsingBook);
        LocalDate datePattern = LocalDate.of(2020,7,6);

        boolean result = notReturnedBooks.createListAllReadersNotReturnedBooks(library,datePattern);
        boolean resultSize = notReturnedBooks.notReturnBooks.size() == 3;

        notReturnedBooks.notReturnBooks.forEach((book,reader) -> {
            resultBookAuthor.set(getBookAuthor(book));
            resultReaderName.set(getReaderName(reader));
        });
        result = result && resultSize && resultBookAuthor.get() && resultReaderName.get();
        assertTrue(result);
    }
    private boolean getBookAuthor(Book book) {
        if (book.getAuthor().equals("Book Author 1")) {
            return true;
        } else if (book.getAuthor().equals("Book Author 2")) {
            return true;
        } else return (book.getAuthor().equals("Book Author 3"));
    }
    private boolean getReaderName(Reader reader) {
        if (reader.getClientName().equals("UserName 1")) {
            return true;
        } else if (reader.getClientName().equals("UserName 2")) {
            return true;
        } else return (reader.getClientName().equals("UserName 3"));
    }
}