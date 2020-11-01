package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;
import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteriaTest {

    AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Joshua Bloch");

    @Test
    public void shouldReturnTrueIfBookByAuthorIsCorrectlyFound() {
        Book book = new Book("Joshua Bloch", "Effective Java", "2001");
        assertTrue(authorSearchCriteria.match(book));
    }

    @Test
    public void shouldReturnTrueIfBookByAuthorIsNotFound() {
        Book book = new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003");
        assertFalse(authorSearchCriteria.match(book));
    }

}