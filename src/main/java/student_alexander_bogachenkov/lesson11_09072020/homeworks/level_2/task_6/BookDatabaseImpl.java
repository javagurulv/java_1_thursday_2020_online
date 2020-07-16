package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private final List<Book> books = new ArrayList<>();
    private long lastId = 0;

    @Override
    public Long save(Book book) {
        long id = nextId();
        book.setId(id);
        this.books.add(book);
        return id;
    }

    private Long nextId() {
        return ++lastId;
    }

}
