package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;
import static org.junit.Assert.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class TitleSearchCriteriaTest {

    TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Effective Java");

    @Test
	@CodeReviewComment(teacher = "Write separate test for true and false cases.") // Done
    public void shouldReturnTrueIfBookByTitleIsCorrectlyFound() {
        Book book = new Book("Joshua Bloch", "Effective Java", "2001");
        assertTrue(titleSearchCriteria.match(book));
    }

    @Test
    public void shouldReturnFalseIfBookByTitleIsNotFound() {
        Book book = new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003");
        assertFalse(titleSearchCriteria.match(book));
    }

}