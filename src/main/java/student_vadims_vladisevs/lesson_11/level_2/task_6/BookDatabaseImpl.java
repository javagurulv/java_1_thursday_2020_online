package student_vadims_vladisevs.lesson_11.level_2.task_6;

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
}
