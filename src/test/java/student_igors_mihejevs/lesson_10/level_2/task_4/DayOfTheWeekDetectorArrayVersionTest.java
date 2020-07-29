package student_igors_mihejevs.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorArrayVersionTest {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(1), "Monday");
    }

    @Test
    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(2), "Tuesday");
    }

    @Test
    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(3), "Wednesday");
    }

    @Test
    public void shouldReturnThursday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(4), "Thursday");
    }

    @Test
    public void shouldReturnFriday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(5), "Friday");
    }

    @Test
    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(6), "Saturday");
    }

    @Test
    public void shouldReturnSunday() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(7), "Sunday");
    }

    @Test
    public void shouldReturnMessage() {
        DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();
        assertEquals(detectorArray.detectDayName(0), "Please input a valid number between 1 and 7");
    }

}