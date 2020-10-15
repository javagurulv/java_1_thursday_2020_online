package student_diana_miranovica.lesson_11.level_3.tasks_from_15_to_22;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TitleSearchCriteriaTest  {

    @Test
    public void returnTrue_whenTittleMatches() {
        TitleSearchCriteria criteria = new TitleSearchCriteria("Deutsch - warum nicht?");
        boolean actual = criteria.match(new Book("Herrad Meese", "Deutsch - warum nicht?", "2003"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void returnFalse_whenTitleMatches(){
        TitleSearchCriteria criteria = new TitleSearchCriteria("Deutsch - warum nicht");
        boolean actual = criteria.match(new Book("Von Roland Dittich" , "Die Scorpion_Frau", "1996"));
        boolean expected = false;
        assertEquals(expected, actual);
    }

}