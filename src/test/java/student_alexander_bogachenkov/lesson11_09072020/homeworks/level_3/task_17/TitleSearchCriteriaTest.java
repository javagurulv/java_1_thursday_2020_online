package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_3.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {

    @Test
    public void shouldReturnTrue_whenTitleMatches() {
        TitleSearchCriteria criteria = new TitleSearchCriteria("Clean Code");
        boolean actual = criteria.match(new Book("Robert Martin", "Clean Code"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenTitleDoesNotMatch() {
        TitleSearchCriteria criteria = new TitleSearchCriteria("Clear Code");
        boolean actual = criteria.match(new Book("Robert Martin", "Clean Code"));
        boolean expected = false;
        assertEquals(expected, actual);
    }

}