package student_diana_miranovica.lesson_10.level_2;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DayOfTheWeekDetectorSwitchVersionTest  {

    @Test
    public void shouldReturnMonday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Monday";
        String actualResult = detector.detectDayName(1);
        assertEquals(expected, actualResult);

    }

    @Test
    public void shouldReturnTuesday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Tuesday";
        String actualResult = detector.detectDayName(2);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnWednesday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Wednesday";
        String actualResult = detector.detectDayName(3);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnThursday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Thursday";
        String actualResult = detector.detectDayName(4);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnFriday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Friday";
        String actualResult = detector.detectDayName(5);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnSaturday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Saturday";
        String actualResult = detector.detectDayName(6);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnSunday(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Sunday";
        String actualResult = detector.detectDayName(7);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnInvalidNumber(){
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actualResult = detector.detectDayName(0);
        assertEquals(expected, actualResult);

    }
}