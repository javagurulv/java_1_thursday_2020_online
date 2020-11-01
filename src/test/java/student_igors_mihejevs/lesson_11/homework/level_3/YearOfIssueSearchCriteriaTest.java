package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteriaTest {

    YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2001");

    @Test
	@CodeReviewComment(teacher = "Write separate test for true and false cases.") // Done
    public void shouldReturnTrueIfBookByYearOfIssueIsCorrectlyFound() {
        Book book = new Book("Joshua Bloch", "Effective Java", "2001");
        assertTrue(yearOfIssueSearchCriteria.match(book));
    }

    @Test
    public void shouldReturnFalseIfBookByYearOfIssueIsNotFound() {
        Book book = new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003");
        assertFalse(yearOfIssueSearchCriteria.match(book));
    }

}