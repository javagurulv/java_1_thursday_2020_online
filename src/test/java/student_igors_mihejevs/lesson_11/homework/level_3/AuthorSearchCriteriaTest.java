package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;
import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void shouldReturnTrueIfBookByAuthorIsCorrectlyFound() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Joshua Bloch");
        Book book1 = new Book("Kathy Sierra, Bert Bates", "Head First Java");
        Book book2 = new Book("Joshua Bloch", "Effective Java");
        assertFalse(authorSearchCriteria.match(book1));
        assertTrue(authorSearchCriteria.match(book2));
    }

}