package student_igors_mihejevs.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorSwitchVersionTest {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(1), "Monday");
    }

    @Test
    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(2), "Tuesday");
    }

    @Test
    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(3), "Wednesday");
    }

    @Test
    public void shouldReturnThursday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(4), "Thursday");
    }

    @Test
    public void shouldReturnFriday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(5), "Friday");
    }

    @Test
    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(6), "Saturday");
    }

    @Test
    public void shouldReturnSunday() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(7), "Sunday");
    }

    @Test
    public void shouldReturnMessage() {
        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorIf.detectDayName(8), "Please input a valid number between 1 and 7");
    }

}