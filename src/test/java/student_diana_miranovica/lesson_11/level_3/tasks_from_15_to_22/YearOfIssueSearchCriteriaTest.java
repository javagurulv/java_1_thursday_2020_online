package student_diana_miranovica.lesson_11.level_3.tasks_from_15_to_22;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YearOfIssueSearchCriteriaTest  {

    @Test
    public void returnTrue_whenYearOfIssueMatches() {
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("1966");
        boolean actual = criteria.match(new Book("Herrad Meese", "Deutsch - warum nicht?","1966"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void returnFalse_whenYearOfIssueMatchesNot(){
        YearOfIssueSearchCriteria criteria = new YearOfIssueSearchCriteria("1996");
        boolean actual = criteria.match(new Book("Von Roland Dittich" , "Die Scorpion_Frau","2005"));
        boolean expected = false;
        assertEquals(expected, actual);
    }


}