package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_19;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    @Test
    public void checkForTrueIfMatch () {
        Book book1 = new Book("Jack", "Aurora", "1975");
        AndSearchCriteria testSearch = new AndSearchCriteria
                (new TitleSearchCriteria("Aurora"),
                 new AuthorSearchCriteria("Jack"));
        assertTrue(testSearch.match(book1));
    }

    @Test
    public void checkForFalseIfNoMatch () {
        Book book2 = new Book("John", "Aurora", "1999");
        AndSearchCriteria testSearch = new AndSearchCriteria
                (new TitleSearchCriteria("Aurora"),
                 new AuthorSearchCriteria("Jack"));
        assertFalse(testSearch.match(book2));
    }

}