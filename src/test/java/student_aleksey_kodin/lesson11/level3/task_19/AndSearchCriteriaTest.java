package student_aleksey_kodin.lesson11.level3.task_19;

import org.junit.Test;
import static org.junit.Assert.*;

public class AndSearchCriteriaTest {
    Book book_1 = new Book("Author#1", "Book#1","2012");

    @Test
    public void match_1_Author_And_Title_waiting_True() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new TitleSearchCriteria("Book#1"));

        boolean result = andSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_2_Author_And_Year_waiting_True() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new YearOfIssueSearchCriteria("2012"));

        boolean result = andSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_3_Book_And_Year_waiting_True() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new TitleSearchCriteria("Book#1"),
                new YearOfIssueSearchCriteria("2012"));

        boolean result = andSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_4_Book_And_Not_Year_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new TitleSearchCriteria("Book#1"),
                new YearOfIssueSearchCriteria("2010"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_5_Not_Book_And_Year_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new TitleSearchCriteria("Book"),
                new YearOfIssueSearchCriteria("2012"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_6_Not_Book_And_Not_Year_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new TitleSearchCriteria("Book"),
                new YearOfIssueSearchCriteria("2010"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_7_Author_And_Not_Book_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new TitleSearchCriteria("Book"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_8_Not_Author_And_Not_Book_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Book"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_9_Not_Author_And_Book_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Book#1"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_10_Author_And_Not_Year_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new YearOfIssueSearchCriteria("2010"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_11_Not_Author_And_Year_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author"),
                new YearOfIssueSearchCriteria("2012"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_12_Not_Author_And_Not_Year_waiting_False() {
        AndSearchCriteria andSearch = new AndSearchCriteria(new AuthorSearchCriteria("Author"),
                new YearOfIssueSearchCriteria("2010"));

        boolean result = andSearch.match(book_1);

        assertFalse(result);
    }
}