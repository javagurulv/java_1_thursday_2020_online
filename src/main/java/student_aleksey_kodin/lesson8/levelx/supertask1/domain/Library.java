package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import student_aleksey_kodin.lesson8.levelx.supertask1.logic.Finder;
import student_aleksey_kodin.lesson8.levelx.supertask1.logic.Penalty;

import java.util.*;

public class Library {

	// В этой модели данных разработанной для
	// библиотеки не видно связей, тут есть мапы,
	// которые как то связаны между собой бизнес
	// логикой но в самой модели связи не отображены.

	// Попробуйте внедрить в эту модель понятие читательского билета и всего что с ним связано.

    public Map<Reader, Book> reservationsBooks = new HashMap<>();
    public Map<Book, BookReservation> booksInLibrary = new HashMap<>();
    public Map<Reader, TakeBook> readersInLibrary = new HashMap<>();
    public Map<Reader, List<? extends Book>> readersWhoTakeBooks = new HashMap<>();
    public Map<Book, DatesUsingBook> dateUsingBook = new HashMap<>();
    public Penalty penalty = new Penalty();

    public boolean addBook(Book book) {
        booksInLibrary.put(book, BookReservation.NO);
        return booksInLibrary.containsKey(book);
    }

    public boolean deleteBook(Book book) {
        booksInLibrary.remove(book);
        return !(booksInLibrary.containsKey(book));
    }

    public boolean deleteReader(Reader reader) {
        readersInLibrary.remove(reader);
        return !(readersInLibrary.containsKey(reader));
    }

    public void setBookReservation(Reader reader, Book book) {
        booksInLibrary.put(book, BookReservation.YES);
        reservationsBooks.put(reader, book);
    }

    public void cancelBookReservation(Reader reader, Book book) {
        booksInLibrary.put(book, BookReservation.NO);
        reservationsBooks.remove(reader);
    }

    public boolean addReader(Reader reader) {
        readersInLibrary.put(reader, TakeBook.NO);
        return readersInLibrary.containsKey(reader);
    }

    public boolean readerTakeBook(Library library, Reader reader, Book book, DatesUsingBook newDatesUsingBook) {
        if (rulesForbidTakingBook(library, reader, book)) {
            return false;
        }
        reader.readerBook.add(book);
        readersWhoTakeBooks.put(reader, reader.readerBook);
        dateUsingBook.put(book, newDatesUsingBook);
        readersInLibrary.put(reader, TakeBook.YES);
        return true;
    }

    public boolean readerReturnBook(Library library, Reader reader, Book book) {
        if (Finder.isReaderTakenCurrentBook(library, reader, book)) {

            List<Book> readerBooks = Finder.getAllBooksForReader(library, reader);
            int deletedIndex = findIndexDeletedBook(readerBooks, book);

            if (isListIndexIncorrect(deletedIndex)) {
                return false;
            }

            readerBooks.remove(deletedIndex);
            readersWhoTakeBooks.put(reader, readerBooks);
            dateUsingBook.remove(book);

            final int EMPTY_LIST = 0;
            if (readerBooks.size() == EMPTY_LIST) {
                readersInLibrary.put(reader, TakeBook.NO);
            }
        }
        return true;
    }

    private int findIndexDeletedBook(List<Book> readerBooks, Book book) {
        final int INCORRECT_LIST_INDEX = -1;
        for (int index = 0; index < readerBooks.size(); index++) {
            if (readerBooks.get(index).equals(book)) {
                return index;
            }
        }
        return INCORRECT_LIST_INDEX;
    }

    private boolean isListIndexIncorrect(int deletedIndex) {
        final int INCORRECT_LIST_INDEX = -1;
        return deletedIndex == INCORRECT_LIST_INDEX;
    }

    private boolean rulesForbidTakingBook(Library library, Reader reader, Book book) {
        return Finder.isBookReserve(library, book) || Finder.isReaderTakenCurrentBook(library, reader, book)
                || Finder.isBookTaken(library, book);

    }
}