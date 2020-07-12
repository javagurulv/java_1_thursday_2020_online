package student_vadims_vladisevs.lesson_11.level_3.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorSearchCriteriaTest {

    @Test
    public void matchV1() {
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("William Golding");
        boolean actual = authorSearchCriteria.match(firstBook);

        assertFalse(actual);
    }

    @Test
    public void matchV2() {
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph");

        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("William Golding");
        boolean actual = authorSearchCriteria.match(secondBook);

        assertTrue(actual);
    }
}