package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDataBaseImpl  implements BookDataBase {

    List<Book> booksList = new ArrayList<>();
    private Long bookId = 1L;

    @Override
    public Long save(Book book) {
        book.setId(bookId);
        booksList.add(book);
        bookId++;
        return bookId;
    }

    @Override
    public int countAllBooks() {
        return booksList.size();
    }

    @Override
    public boolean delete(Long bookId) {
        if (!isBookIdInTheBooksList(bookId)) {
            return false;
        } else {
            booksList.remove(getBookIndexInListById(bookId));
            return true;
        }
    }


    @Override
    public boolean delete (Book book) {
        if (!isBookInBooksList(book)) {
            return false;
        } else {
            booksList.remove(book);
            return true;
        }
    }

    @Override
    public void deleteByAuthor(String author) {
        booksList.removeAll(findByAuthor(author));
    }

    @Override
    public void deleteByTitle(String title) {
        booksList.removeAll(findByTitle(title));
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : booksList) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        } return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : booksList) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        } return booksByTitle;
    }


    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : booksList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        } return Optional.empty();
    }

    private boolean isBookInBooksList (Book book) {
        for (Book bookInList : booksList) {
            if (bookInList.equals(book)) {
                return true;
            }
        } return false;
    }

    private int getBookIndexInListById (Long bookId) {
        int bookIndexInList = 0;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(bookId)) {
                bookIndexInList = i;
            }
        } return bookIndexInList;
    }

    private boolean isBookIdInTheBooksList(Long bookId) {
        for (Book book : booksList) {
            if (book.getId().equals(bookId)) {
                return true;
            }
        } return false;
    }


}
