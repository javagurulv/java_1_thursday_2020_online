package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_3.task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void shouldReturnTrue_whenYearOfIssueMatches() {
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("2009");
        boolean actual = criteria.match(new Book("Robert Martin", "Clean Code", "2009"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenYearOfIssueDoesNotMatch() {
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("2011");
        boolean actual = criteria.match(new Book("Robert Martin", "Clean Code", "2009"));
        boolean expected = false;
        assertEquals(expected, actual);
    }
}