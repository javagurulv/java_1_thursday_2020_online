package student_dmitrijs_visuns.homeworks.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionTest {

    @Test
    public void TestForMonday() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expected = "Monday";
        String result = ifVersion.detectDayName(1);
        assertTrue(result == expected);

    }

    @Test
    public void TestForSunday() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expected = "Sunday";
        String result = ifVersion.detectDayName(7);
        assertTrue(result == expected);

    }

    @Test
    public void TestForInvalidNumber1() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expected = "Please input a valid number between 1 and 7";
        String result = ifVersion.detectDayName(0);
        assertTrue(result == expected);

    }

    @Test
    public void TestForInvalidNumber2() {
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expected = "Please input a valid number between 1 and 7";
        String result = ifVersion.detectDayName(12);
        assertTrue(result == expected);

    }

}