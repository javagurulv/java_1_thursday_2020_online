package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {

    @Test
    public void checkForTrueIfMatch () {
        Book book1 = new Book("Jack", "Aurora");
        TitleSearchCriteria testSearch = new TitleSearchCriteria("Aurora");
        assertTrue(testSearch.match(book1));
    }

    @Test
    public void checkForFalseIfNoMatch () {
        Book book2 = new Book("John", "NotAurora");
        TitleSearchCriteria testSearch = new TitleSearchCriteria("Aurora");
        assertFalse(testSearch.match(book2));
    }


}