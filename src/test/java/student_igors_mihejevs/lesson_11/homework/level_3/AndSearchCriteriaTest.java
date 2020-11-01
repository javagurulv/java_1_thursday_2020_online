package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class AndSearchCriteriaTest {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Joshua Bloch");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Effective Java");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

    @Test
	@CodeReviewComment(teacher = "Write separate test for true and false cases.") // Done
    public void shouldReturnTrueIfBookIsCorrectlyFoundByAndSearchCriteria() {
        Book book = (new Book("Joshua Bloch", "Effective Java", "2001"));
        assertTrue(searchCriteria.match(book));
    }

    @Test
    public void shouldReturnTrueIfBookIsNotFoundByAndSearchCriteria() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        Book book2 = (new Book("Robert C. Martin", "Clean Code", "2008"));
        assertFalse(searchCriteria.match(book1));
        assertFalse(searchCriteria.match(book2));
    }

}