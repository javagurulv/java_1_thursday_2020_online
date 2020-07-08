package student_aleksey_kodin.lesson11.level2.task_7;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(++id);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return books.removeIf(b -> b.getId().equals(bookId));
    }
}
