package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotReturnedBooks {
    public Map<Book, Reader> notReturnBooks = new HashMap<>();

    public List<Book> createListBookNotReturnReader(Library library, Reader reader, LocalDate datePattern) {
        List<Book> takenBooks = Finder.getAllBooksForReader(library, reader);
        List<Book> notReturnBooks = new ArrayList<>();

        for (Book takenBook : takenBooks) {
            if (datePattern.isAfter(Finder.getFinishDateForBook(library, takenBook))) {
                notReturnBooks.add(takenBook);
            }
        }
        return notReturnBooks;
    }

    public boolean createListAllReadersNotReturnedBooks(Library library, LocalDate datePattern) {
        boolean result = false;
        for (Reader reader : library.readersInLibrary.keySet()) {
            if (Finder.isReaderBookTaken(library, reader)) {
                List<Book> notReturnBooksFromReader = createListBookNotReturnReader(library, reader, datePattern);
                for (Book book : notReturnBooksFromReader) {
                    notReturnBooks.put(book, reader);
                    result = true;
                }
            }
        }
        return result;
    }
}
