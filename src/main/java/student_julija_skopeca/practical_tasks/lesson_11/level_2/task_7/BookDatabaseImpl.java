package student_julija_skopeca.practical_tasks.lesson_11.level_2.task_7;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> booksList = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(++id);
        booksList.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return booksList.removeIf(b -> b.getId().equals(bookId));
    }

}
