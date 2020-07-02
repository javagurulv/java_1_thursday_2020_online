package student_aleksey_kodin.lesson10.level6.task_25;

import student_aleksey_kodin.lesson10.level6.task_25.logic.LogicChecks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class BookReaderImpl implements BookReader {
    private final List<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books, book);

        if (isBookExisting) {
            return false;
        }

        boolean isBookAuthorNotEmpty = LogicChecks.isBookAuthorNotEmpty(book);
        boolean isBookTitleNotEmpty = LogicChecks.isBookTitleNotEmpty(book);

        if (isBookAuthorNotEmpty && isBookTitleNotEmpty) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books, book);

        if (!isBookExisting) {
            return false;
        }
        books.remove(book);
        return true;
    }

    @Override
    public String[] createBookList() {
        String[] bookList = new String[books.size()];

        for (int i = 0; i < bookList.length; i++) {
            bookList[i] = books.get(i).getBookName() + " [" + books.get(i).getBookAuthor() + "]";
        }
        return bookList;
    }

    @Override
    public List<Book> searchForBooksByAuthor(String authorName) {

        return books.stream().filter(b -> b.getBookAuthor().contains(authorName))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> searchForBooksByTitle(String bookTitle) {

        return books.stream().filter(b -> b.getBookName().contains(bookTitle))
                .collect(Collectors.toList());
    }

    @Override
    public boolean finishedBooks(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books, book);

        if (!isBookExisting) {
            return false;
        }

        findBook(book).ifPresent(currentBook -> currentBook.setUnreadBook(true));
        return true;
    }

    @Override
    public boolean unreadBooks(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books, book);

        if (!isBookExisting) {
            return false;
        }

        findBook(book).ifPresent(currentBook -> currentBook.setUnreadBook(true));
        return true;
    }

    @Override
    public String[] createFinishedBookList() {
        List<Book> finishedBooks = books.stream().filter(Book::getFinishedBook)
                .collect(Collectors.toList());

        String[] finishedBookList = new String[finishedBooks.size()];

        for (int i = 0; i < finishedBookList.length; i++) {
            finishedBookList[i] = finishedBooks.get(i).getBookName() + " [" + finishedBooks.get(i).getBookAuthor() + "]";
        }
        return finishedBookList;
    }

    @Override
    public String[] createUnreadBookList() {
        List<Book> unreadBooks = books.stream().filter(Book::getUnreadBook)
                .collect(Collectors.toList());

        String[] unreadBookList = new String[unreadBooks.size()];

        for (int i = 0; i < unreadBookList.length; i++) {
            unreadBookList[i] = unreadBooks.get(i).getBookName() + " [" + unreadBooks.get(i).getBookAuthor() + "]";
        }
        return unreadBookList;
    }

    private Optional<Book> findBook(Book book) {
        return books.stream().filter(b -> b.equals(book)).findFirst();
    }
}
