package student_diana_miranovica.lesson_11.level_3.tasks_from_15_to_22;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AuthorSearchCriteriaTest {

    @Test
    public void returnTrue_whenAuthorMatches() {
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Von Roland Dittrich");
        boolean actual = criteria.match(new Book("Von Roland Dittrich", "Die Scorpion-Frau", "2003"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void returnFalse_whenAuthorMatches(){
        AuthorSearchCriteria criteria = new AuthorSearchCriteria("Herrad Meese");
        boolean actual = criteria.match(new Book("Von Roland Dittich" , "Die Scorpion_Frau", "1990"));
        boolean expected = false;
        assertEquals(expected, actual);
    }

}