package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void shouldReturnTrueIfBookByYearOfIssueIsCorrectlyFound() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2001");
        Book book1 = new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003");
        Book book2 = new Book("Joshua Bloch", "Effective Java", "2001");
        assertFalse(yearOfIssueSearchCriteria.match(book1));
        assertTrue(yearOfIssueSearchCriteria.match(book2));
    }


}