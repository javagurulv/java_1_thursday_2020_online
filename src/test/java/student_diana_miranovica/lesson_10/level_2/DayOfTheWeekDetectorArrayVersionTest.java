package student_diana_miranovica.lesson_10.level_2;

import junit.framework.TestCase;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DayOfTheWeekDetectorArrayVersionTest  {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Monday";
        String actualResult = detector.detectDayName(1);
        assertEquals(expected, actualResult);
    }
    @Test
    public void  shouldReturnTuesday(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Tuesday";
        String actualResult = detector.detectDayName(2);
        assertEquals(expected, actualResult);

    }

    @Test
    public void  shouldReturnWednesday(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Wednesday";
        String actualResult = detector.detectDayName(3);
        assertEquals(expected, actualResult);

    }

    @Test
    public void  shouldReturnThursday(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Thursday";
        String actualResult = detector.detectDayName(4);
        assertEquals(expected, actualResult);

    }

    @Test
    public void  shouldReturnFriday(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Friday";
        String actualResult = detector.detectDayName(5);
        assertEquals(expected, actualResult);

    }

    @Test
    public void  shouldReturnSaturday(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Saturday";
        String actualResult = detector.detectDayName(6);
        assertEquals(expected, actualResult);

    }

    @Test
    public void  shouldReturnSunday(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Sunday";
        String actualResult = detector.detectDayName(7);
        assertEquals(expected, actualResult);

    }
    @Test
    public void  shouldReturnInvalidNumberNull(){
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Please input integer number between 1 and 7";
        String actualResult = detector.detectDayName(0);
        assertEquals(expected, actualResult);

    }



}