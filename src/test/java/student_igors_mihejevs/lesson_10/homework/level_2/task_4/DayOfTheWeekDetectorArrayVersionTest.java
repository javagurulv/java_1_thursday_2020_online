package student_igors_mihejevs.lesson_10.homework.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArrayVersionTest {

    DayOfTheWeekDetector detectorArray = new DayOfTheWeekDetectorArrayVersion();

    @Test
    public void shouldReturnMonday() {
        assertEquals(detectorArray.detectDayName(1), "Monday");
    }

    @Test
    public void shouldReturnTuesday() {
        assertEquals(detectorArray.detectDayName(2), "Tuesday");
    }

    @Test
    public void shouldReturnWednesday() {
        assertEquals(detectorArray.detectDayName(3), "Wednesday");
    }

    @Test
    public void shouldReturnThursday() {
        assertEquals(detectorArray.detectDayName(4), "Thursday");
    }

    @Test
    public void shouldReturnFriday() {
        assertEquals(detectorArray.detectDayName(5), "Friday");
    }

    @Test
    public void shouldReturnSaturday() {
        assertEquals(detectorArray.detectDayName(6), "Saturday");
    }

    @Test
    public void shouldReturnSunday() {
        assertEquals(detectorArray.detectDayName(7), "Sunday");
    }

    @Test
    public void shouldReturnMessage() {
        assertEquals(detectorArray.detectDayName(0), "Please input a valid number between 1 and 7");
    }

}