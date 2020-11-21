package student_igors_mihejevs.lesson_11.homework.level_7.database;

import student_igors_mihejevs.lesson_11.homework.level_7.domain.Book;
import student_igors_mihejevs.lesson_11.homework.level_7.search_criterias.SearchCriteria;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@CodeReview(approved = true)
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

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}
