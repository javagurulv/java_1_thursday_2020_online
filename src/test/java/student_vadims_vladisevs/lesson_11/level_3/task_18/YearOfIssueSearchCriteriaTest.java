package student_vadims_vladisevs.lesson_11.level_3.task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void matchV1() {
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1945");
        boolean actual = yearOfIssueSearchCriteria.match(firstBook);

        assertFalse(actual);
    }

    @Test
    public void matchV2() {
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1945");
        boolean actual = yearOfIssueSearchCriteria.match(fifthBook);

        assertTrue(actual);
    }
}