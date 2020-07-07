package student_aleksey_kodin.lesson11.level3.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {
    Book book_1 = new Book("Author#1", "Book#1");

    @Test
    public void match_1_waiting_True() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Book#1");

        boolean result = titleSearchCriteria.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_2_waiting_False() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Book#2");

        boolean result = titleSearchCriteria.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_3_waiting_False() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("");

        boolean result = titleSearchCriteria.match(book_1);

        assertFalse(result);
    }
}