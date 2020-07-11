package student_vadims_vladisevs.lesson_11.level_2.task_7;

import java.util.ArrayList;
import java.util.List;

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
        if (isBookInList(bookId)){
            books.remove(getBookIndexFromListById(bookId));
            return true;
        }
        return false;
    }

    private int getBookIndexFromListById(Long bookId){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId().equals(bookId)){
                return i;
            }
        }
        return 0;
    }

    private boolean isBookInList(Long bookId){
        for (Book tempBook : books){
            if (tempBook.getId().equals(bookId)){
                return true;
            }
        }
        return false;
    }
}
