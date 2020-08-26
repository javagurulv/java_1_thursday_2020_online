package student_igors_mihejevs.lesson_11.homework.level_2;

import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

}
