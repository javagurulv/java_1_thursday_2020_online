package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void checkForTrueIfMatch () {
        Book book1 = new Book("Jack", "Aurora", "1975");
        YearOfIssueSearchCriteria testSearch = new YearOfIssueSearchCriteria("1975");
        assertTrue(testSearch.match(book1));
    }

    @Test
    public void checkForFalseIfNoMatch () {
        Book book2 = new Book("John", "NotAurora", "");
        YearOfIssueSearchCriteria testSearch = new YearOfIssueSearchCriteria("1975");
        assertFalse(testSearch.match(book2));
    }

}