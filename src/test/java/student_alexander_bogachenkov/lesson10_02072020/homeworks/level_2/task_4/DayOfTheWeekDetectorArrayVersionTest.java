package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorArrayVersionTest {

    @Test
    public void shouldReturnMonday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Monday";
        String actual = detector.detectDayName(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTuesday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Tuesday";
        String actual = detector.detectDayName(2);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWednesday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Wednesday";
        String actual = detector.detectDayName(3);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnThursday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Thursday";
        String actual = detector.detectDayName(4);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFriday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Friday";
        String actual = detector.detectDayName(5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSaturday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Saturday";
        String actual = detector.detectDayName(6);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSunday() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Sunday";
        String actual = detector.detectDayName(7);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnDayOfTheWeek_whenNumberIsZero() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actual = detector.detectDayName(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnDayOfTheWeek() {
        DayOfTheWeekDetectorArrayVersion detector = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Please input a valid number between 1 and 7";
        String actual = detector.detectDayName(15);
        assertEquals(expected, actual);
    }

}