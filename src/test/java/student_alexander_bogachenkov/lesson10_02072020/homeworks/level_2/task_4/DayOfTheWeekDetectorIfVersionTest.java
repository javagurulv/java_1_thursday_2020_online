package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionTest {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Monday";
        String actual = detector.detectDayName(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Tuesday";
        String actual = detector.detectDayName(2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Wednesday";
        String actual = detector.detectDayName(3);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Thursday";
        String actual = detector.detectDayName(4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Friday";
        String actual = detector.detectDayName(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Saturday";
        String actual = detector.detectDayName(6);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Sunday";
        String actual = detector.detectDayName(7);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnDayOfTheWeek_whenNumberIsZero() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actual = detector.detectDayName(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnDayOfTheWeek() {
        DayOfTheWeekDetectorIfVersion detector = new DayOfTheWeekDetectorIfVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actual = detector.detectDayName(15);
        assertEquals(expected, actual);
    }

}