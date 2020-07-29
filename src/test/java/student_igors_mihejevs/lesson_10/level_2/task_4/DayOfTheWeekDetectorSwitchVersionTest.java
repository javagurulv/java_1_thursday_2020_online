package student_igors_mihejevs.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorSwitchVersionTest {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(1), "Monday");
    }

    @Test
    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(2), "Tuesday");
    }

    @Test
    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(3), "Wednesday");
    }

    @Test
    public void shouldReturnThursday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(4), "Thursday");
    }

    @Test
    public void shouldReturnFriday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(5), "Friday");
    }

    @Test
    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(6), "Saturday");
    }

    @Test
    public void shouldReturnSunday() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(7), "Sunday");
    }

    @Test
    public void shouldReturnMessage() {
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();
        assertEquals(detectorSwitch.detectDayName(8), "Please input a valid number between 1 and 7");
    }

}