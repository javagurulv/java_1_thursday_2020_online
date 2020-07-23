package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_6;

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


}
