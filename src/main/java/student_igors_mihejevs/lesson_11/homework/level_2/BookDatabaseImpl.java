package student_igors_mihejevs.lesson_11.homework.level_2;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {
    Long id = Long.parseLong("1");

    @Override
    public Long save(Book book) {
        List<Book> booksList = new ArrayList<>();
        book.setId(id);
        booksList.add(book);
        return ++id;
    }

}
