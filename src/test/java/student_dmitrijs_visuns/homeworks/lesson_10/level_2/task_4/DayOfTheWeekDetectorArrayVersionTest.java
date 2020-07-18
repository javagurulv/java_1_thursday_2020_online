package student_dmitrijs_visuns.homeworks.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorArrayVersionTest {

    @Test
    public void TestForMonday() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Monday";
        String result = arrayVersion.detectDayName(1);
        assertTrue(result == expected);

}

    @Test
    public void TestForSunday() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Sunday";
        String result = arrayVersion.detectDayName(7);
        assertTrue(result == expected);

    }

    @Test
    public void TestForInvalidNumber1() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Please input a valid number between 1 and 7";
        String result = arrayVersion.detectDayName(0);
        assertTrue(result == expected);

    }

    @Test
    public void TestForInvalidNumber2() {
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expected = "Please input a valid number between 1 and 7";
        String result = arrayVersion.detectDayName(12);
        assertTrue(result == expected);

    }

}