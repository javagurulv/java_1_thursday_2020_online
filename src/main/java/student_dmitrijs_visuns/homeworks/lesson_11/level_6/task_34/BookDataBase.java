package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_34;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

interface BookDataBase {

    Long save (Book book);

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

    Map<String, List> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();



}
