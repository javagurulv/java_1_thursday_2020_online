package student_aleksey_kodin.lesson10.level2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorIfVersionTest {
    DayOfTheWeekDetectorIfVersion dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();

    @Test
    public void detectDayNameSwitch_Return_Monday() {
        String result = dayOfTheWeekDetector.detectDayNameSwitch(0);
        assertEquals(result,"Monday");
    }

    @Test
    public void detectDayNameSwitch_Not_DayOfWeek() {
        String result = dayOfTheWeekDetector.detectDayNameSwitch(10);
        assertEquals(result,"not day of week");
    }

    @Test
    public void detectDayNameIf_Return_Sunday() {
        String result = dayOfTheWeekDetector.detectDayName(6);
        assertEquals(result,"Sunday");
    }

    @Test
    public void detectDayNameIf_Not_DayOfWeek() {
        String result = dayOfTheWeekDetector.detectDayName(12);
        assertEquals(result,"not day of week");
    }

    @Test
    public void detectDayNameArray_Return_Friday() {
        String result = dayOfTheWeekDetector.detectDayNameArray(4);
        assertEquals(result,"Friday");
    }

    @Test
    public void detectDayNameArray_Not_DayOfWeek() {
        String result = dayOfTheWeekDetector.detectDayNameArray(-5);
        assertEquals(result,"not day of week");
    }

}