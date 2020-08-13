package student_dmitrijs_visuns.homeworks.lesson_11.level_3.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void checkForTrueIfMatch () {
        Book book1 = new Book("Jack", "A");
        AuthorSearchCriteria testSearch = new AuthorSearchCriteria("Jack");
        assertTrue(testSearch.match(book1));
    }

    @Test
    public void checkForFalseIfNoMatch () {
        Book book2 = new Book("John", "B");
        AuthorSearchCriteria testSearch = new AuthorSearchCriteria("Jack");
        assertFalse(testSearch.match(book2));
    }

}