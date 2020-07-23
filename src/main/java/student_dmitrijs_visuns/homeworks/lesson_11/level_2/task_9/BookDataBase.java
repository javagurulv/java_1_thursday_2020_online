package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_9;

import java.util.Optional;

interface BookDataBase {

    Long save (Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);



}
