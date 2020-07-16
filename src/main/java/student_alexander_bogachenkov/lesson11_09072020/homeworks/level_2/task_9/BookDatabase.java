package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_9;

import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

}
