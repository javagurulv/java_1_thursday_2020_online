package student_igors_mihejevs.lesson_11.homework.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {
    Long id = Long.parseLong("1");
    List<Book> booksList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId(id);
        booksList.add(book);
        return ++id;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : booksList) {
            if (book.getId().equals(bookId)) {
                booksList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book books : booksList) {
            if ((books.getAuthor().equals(book.getAuthor())) && (books.getTitle().equals(book.getTitle()))) {
                booksList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : booksList) {
            if (book.getId().equals(bookId)) {
                booksList.remove(book);
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
