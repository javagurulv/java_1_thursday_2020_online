package student_vadims_vladisevs.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionTest {

    @Test
    public void detectDayNameV1() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetector.detectDayName(1);
        assertEquals("Monday", actual);
    }

    @Test
    public void detectDayNameV2() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetector.detectDayName(12);
        assertEquals("Please input a valid number between 1 and 7", actual);
    }

    @Test
    public void detectDayNameWithSwitchV1() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetector.detectDayNameWithSwitch(2);
        assertEquals("Tuesday", actual);
    }

    @Test
    public void detectDayNameWithSwitchV2() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetector.detectDayNameWithSwitch(9);
        assertEquals("Please input a valid number between 1 and 7", actual);
    }

    @Test
    public void detectDayNameWithArrayV1() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetector.detectDayNameWithArray(3);
        assertEquals("Wednesday", actual);
    }

    @Test
    public void detectDayNameWithArrayV2() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String actual = dayOfTheWeekDetector.detectDayNameWithArray(8);
        assertEquals("Please input a valid number between 1 and 7", actual);
    }
}