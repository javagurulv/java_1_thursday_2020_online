package student_aleksey_kodin.lesson11.level3.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    Book book_1 = new Book("Author#1", "Book#1");

    @Test
    public void match_1_waiting_True() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author#1");

        boolean result = authorSearchCriteria.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_2_waiting_False() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author#2");

        boolean result = authorSearchCriteria.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_3_waiting_False() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("");

        boolean result = authorSearchCriteria.match(book_1);

        assertFalse(result);
    }
}