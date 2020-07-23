package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_4.task_23;

import java.util.List;
import java.util.Optional;
import java.util.Set;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    Set<String> findUniqueAuthors();

}
