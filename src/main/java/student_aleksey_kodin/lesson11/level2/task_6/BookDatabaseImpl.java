package student_aleksey_kodin.lesson11.level2.task_6;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements  BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(++id);
        books.add(book);
        return book.getId();
    }
}
