package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void checkListByAndSearch () {

        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("Jack", "Aurora", "1985");
        Book book3 = new Book("FutureJack", "SpaceMarines", "2035");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        AndSearchCriteria andSearch = new AndSearchCriteria
                (new TitleSearchCriteria("Aurora"),
                 new AuthorSearchCriteria("Jack"));
        SearchCriteria testSearch = andSearch;
        List<Book> testSearchList = new ArrayList<>(prototype.find(testSearch));

        assertTrue(testSearchList.contains(book1));
        assertTrue(testSearchList.contains(book2));
        assertTrue(testSearchList.size() == 2);
    }

    @Test
    public void checkListByOrSearch () {

        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Aurora", "1975");
        Book book2 = new Book("Jack", "Aurora", "1985");
        Book book3 = new Book("FutureJack", "SpaceMarines", "2035");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        AndSearchCriteria andSearch = new AndSearchCriteria
                (new TitleSearchCriteria("Aurora"),
                 new AuthorSearchCriteria("Jack"));
        SearchCriteria testSearch = andSearch;
        List<Book> testSearchList = new ArrayList<>(prototype.find(testSearch));

        assertTrue(testSearchList.contains(book1));
        assertTrue(testSearchList.contains(book2));
        assertTrue(testSearchList.size() == 2);
    }


    @Test
    public void checkIfNoMatch () {

        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "Titanic", "1975");
        Book book2 = new Book("Jack", "Holmes", "1985");
        Book book3 = new Book("FutureJack", "SpaceMarines", "2035");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        AndSearchCriteria andSearch = new AndSearchCriteria
                (new TitleSearchCriteria("Aurora"),
                 new AuthorSearchCriteria("Jack"));
        SearchCriteria testSearch = andSearch;
        List<Book> testSearchList = new ArrayList<>(prototype.find(testSearch));

        assertTrue(testSearchList.isEmpty());
    }

}