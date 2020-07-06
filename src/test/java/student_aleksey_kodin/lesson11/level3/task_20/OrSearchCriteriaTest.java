package student_aleksey_kodin.lesson11.level3.task_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {

    Book book_1 = new Book("Author#1", "Book#1", "2012");

    @Test
    public void match_1_Author_Or_Not_Title_waiting_True() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new TitleSearchCriteria("Book"));

        boolean result = orSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_2_Not_Author_Or_Title_waiting_True() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Book#1"));

        boolean result = orSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_3_Not_Author_Or_Not_Title_waiting_False() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Book"));

        boolean result = orSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_4_Author_Or_Not_Year_waiting_True() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new YearOfIssueSearchCriteria("2000"));

        boolean result = orSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_5_Not_Author_Or_Year_waiting_True() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new AuthorSearchCriteria("Author"),
                new YearOfIssueSearchCriteria("2012"));

        boolean result = orSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_6_Not_Author_Or_Not_Year_waiting_False() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new AuthorSearchCriteria("Author"),
                new YearOfIssueSearchCriteria("2000"));

        boolean result = orSearch.match(book_1);

        assertFalse(result);
    }

    @Test
    public void match_7_Book_Or_Not_Year_waiting_True() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new TitleSearchCriteria("Book#1"),
                new YearOfIssueSearchCriteria("2000"));

        boolean result = orSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_8_Not_Book_Or_Year_waiting_True() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new TitleSearchCriteria("Book"),
                new YearOfIssueSearchCriteria("2012"));

        boolean result = orSearch.match(book_1);

        assertTrue(result);
    }

    @Test
    public void match_9_Not_Book_Or_Not_Year_waiting_False() {
        OrSearchCriteria orSearch = new OrSearchCriteria(new TitleSearchCriteria("Book"),
                new YearOfIssueSearchCriteria("2000"));

        boolean result = orSearch.match(book_1);

        assertFalse(result);
    }
}