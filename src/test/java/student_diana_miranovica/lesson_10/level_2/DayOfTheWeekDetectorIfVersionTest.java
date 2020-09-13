package student_diana_miranovica.lesson_10.level_2;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DayOfTheWeekDetectorIfVersionTest  {


    @Test
    public void shouldReturnMonday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Monday";
        String actualResult = detector.detectDayName(1);
        assertEquals(expected, actualResult);

    }

    @Test
    public void shouldReturnTuesday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Tuesday";
        String actualResult = detector.detectDayName(2);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnWednesday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Wednesday";
        String actualResult = detector.detectDayName(3);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnThursday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Thursday";
        String actualResult = detector.detectDayName(4);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnFriday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Friday";
        String actualResult = detector.detectDayName(5);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnSaturday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Saturday";
        String actualResult = detector.detectDayName(6);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnSunday(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Sunday";
        String actualResult = detector.detectDayName(7);
        assertEquals(expected, actualResult);

    }
    @Test
    public void shouldReturnInvalidNumber(){
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actualResult = detector.detectDayName(0);
        assertEquals(expected, actualResult);

    }
}