package student_igors_mihejevs.lesson_11.homework.level_5;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Set<String> find(String text);

}
