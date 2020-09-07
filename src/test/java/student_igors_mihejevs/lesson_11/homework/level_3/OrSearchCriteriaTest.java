package student_igors_mihejevs.lesson_11.homework.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class OrSearchCriteriaTest {

    @Test
    public void shouldReturnTrueIfBookIsCorrectlyFoundByAndSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Joshua Bloch");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Clean Code");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java", "2001"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code", "2008"));
        assertFalse(searchCriteria.match(book1));
        assertTrue(searchCriteria.match(book2));
        assertTrue(searchCriteria.match(book3));
    }

}