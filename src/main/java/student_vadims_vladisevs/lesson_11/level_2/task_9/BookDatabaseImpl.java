package student_vadims_vladisevs.lesson_11.level_2.task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookId += 1;
        book.setId(bookId);
        books.add(book);
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        if (isBookInList(bookId)) {
            books.remove(getBookIndexFromListById(bookId));
            return true;
        }
        return false;
    }

    private int getBookIndexFromListById(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(bookId)) {
                return i;
            }
        }
        return 0;
    }

    private boolean isBookInList(Long bookId) {
        for (Book tempBook : books) {
            if (tempBook.getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {
        if (isBookInList(book)) {
            books.remove(getBookIndexFromListByBook(book));
            return true;
        }
        return false;
    }

    private int getBookIndexFromListByBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                return i;
            }
        }
        return 0;
    }

    private boolean isBookInList(Book book) {
        for (Book tempBook : books) {
            if (tempBook.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        if (isBookInList(bookId)){
            return Optional.of(books.get(getBookIndexFromListById(bookId)));
        }
        return Optional.empty();
    }
}



