package student_vadims_vladisevs.lesson_11.level_3.task_19;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndSearchCriteriaTest {

    @Test
    public void matchV1() {
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");


        SearchCriteria leftCondition = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria rightCondition = new TitleSearchCriteria("Three Comrades");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(leftCondition, rightCondition);

        boolean actual = andSearchCriteria.match(firstBook);
        assertTrue(actual);
    }

    @Test
    public void matchV2() {
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");


        SearchCriteria leftCondition = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria rightCondition = new TitleSearchCriteria("Three Comrades");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(leftCondition, rightCondition);

        boolean actual = andSearchCriteria.match(secondBook);
        assertFalse(actual);
    }
}