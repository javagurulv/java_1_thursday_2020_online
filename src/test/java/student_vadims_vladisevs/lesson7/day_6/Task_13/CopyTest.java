package student_vadims_vladisevs.lesson7.day_6.Task_13;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {
    Copy copyTest = new Copy();


    @Test
    public void copyInRangeV1() {
        //Length = numbers count;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = copyTest.copyInRange(array,3,8);
        assertEquals(6, resultArray.length);
    }

    @Test
    public void copyInRangeV2() {
        //First number = 3;
        //Last number = 8;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = copyTest.copyInRange(array,3,8);
        int firstNumberInArray = resultArray[0];
        int lastNumberInArray = resultArray[resultArray.length - 1];
        assertEquals(3, firstNumberInArray);
        assertEquals(8, lastNumberInArray);
    }
}