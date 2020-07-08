package student_aleksey_kodin.lesson11.level3.task_18;

import org.junit.Test;
import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {
    Book book_1 = new Book("Author#1", "Book#1","2012");

    @Test
    public void match_1_waiting_True() {
        YearOfIssueSearchCriteria yearOfIssueSearch = new YearOfIssueSearchCriteria("2012");

        boolean result = yearOfIssueSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_2_waiting_False() {
        YearOfIssueSearchCriteria yearOfIssueSearch = new YearOfIssueSearchCriteria("2010");

        boolean result = yearOfIssueSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_3_waiting_False() {
        YearOfIssueSearchCriteria yearOfIssueSearch = new YearOfIssueSearchCriteria("");

        boolean result = yearOfIssueSearch.match(book_1);

        assertFalse(result);
    }
}