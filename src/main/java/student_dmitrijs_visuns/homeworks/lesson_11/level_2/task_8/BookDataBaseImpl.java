package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_8;

import java.util.ArrayList;
import java.util.List;

class BookDataBaseImpl  implements BookDataBase {

    List<Book> booksList = new ArrayList<>();
    private Long startId = 1L;

    @Override
    public Long save(Book book) {
        book.setId(startId);
        booksList.add(book);
        startId++;
        return startId;
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
