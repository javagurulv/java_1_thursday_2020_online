package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_3.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void shouldReturnTrue_whenAuthorMatches() {
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("J. K. Rowling");
        boolean actual = criteria.match(new Book("J. K. Rowling", "Harry Potter"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenAuthorDoesNotMatch() {
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Robert Martin");
        boolean actual = criteria.match(new Book("J. K. Rowling", "Harry Potter"));
        boolean expected = false;
        assertEquals(expected, actual);
    }

}