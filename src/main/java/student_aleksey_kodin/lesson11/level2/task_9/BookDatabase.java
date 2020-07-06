package student_aleksey_kodin.lesson11.level2.task_9;

import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);
}
