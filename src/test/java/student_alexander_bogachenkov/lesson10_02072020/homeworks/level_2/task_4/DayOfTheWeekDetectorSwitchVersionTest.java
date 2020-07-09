package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorSwitchVersionTest {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Monday";
        String actual = detector.detectDayName(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Tuesday";
        String actual = detector.detectDayName(2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Wednesday";
        String actual = detector.detectDayName(3);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Thursday";
        String actual = detector.detectDayName(4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Friday";
        String actual = detector.detectDayName(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Saturday";
        String actual = detector.detectDayName(6);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Sunday";
        String actual = detector.detectDayName(7);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnDayOfTheWeek_whenNumberIsZero() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actual = detector.detectDayName(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnDayOfTheWeek() {
        DayOfTheWeekDetectorSwitchVersion detector = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actual = detector.detectDayName(15);
        assertEquals(expected, actual);
    }

}