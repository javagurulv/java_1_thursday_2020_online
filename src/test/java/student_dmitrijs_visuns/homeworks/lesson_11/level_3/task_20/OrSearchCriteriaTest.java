package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    @Test
    public void checkForTrueIfMatch () {
        Book book1 = new Book("Jack", "Aurora", "1975");
        OrSearchCriteria testSearch = new OrSearchCriteria
                (new TitleSearchCriteria("Aurora"),
                        new AuthorSearchCriteria("Peter"));
        assertTrue(testSearch.match(book1));
    }

    @Test
    public void checkForFalseIfNoMatch () {
        Book book2 = new Book("John", "Aurora", "1999");
        OrSearchCriteria testSearch = new OrSearchCriteria
                (new TitleSearchCriteria("Andromeda"),
                        new AuthorSearchCriteria("Simon"));
        assertFalse(testSearch.match(book2));
    }


}