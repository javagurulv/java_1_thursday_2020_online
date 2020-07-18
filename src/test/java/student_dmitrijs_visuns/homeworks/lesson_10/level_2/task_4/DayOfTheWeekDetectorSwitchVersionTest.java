package student_dmitrijs_visuns.homeworks.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorSwitchVersionTest {

    @Test
    public void TestForMonday() {
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Monday";
        String result = switchVersion.detectDayName(1);
        assertTrue(result == expected);

    }

    @Test
    public void TestForSunday() {
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Sunday";
        String result = switchVersion.detectDayName(7);
        assertTrue(result == expected);

    }

    @Test
    public void TestForInvalidNumber1() {
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Please input a valid number between 1 and 7";
        String result = switchVersion.detectDayName(0);
        assertTrue(result == expected);

    }

    @Test
    public void TestForInvalidNumber2() {
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expected = "Please input a valid number between 1 and 7";
        String result = switchVersion.detectDayName(12);
        assertTrue(result == expected);

    }


}