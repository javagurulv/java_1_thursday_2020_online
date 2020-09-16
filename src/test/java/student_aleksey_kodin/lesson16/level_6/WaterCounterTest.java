package student_aleksey_kodin.lesson16.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WaterCounterTest {
    WaterCounter waterCounter = new WaterCounter();

    @Test
    public void Test() {
        int[] entry = {1,0,1};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,1);
    }

    @Test
    public void Test_1() {
        int[] entry = {1,0,0,0,0,1};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,4);
    }

    @Test
    public void Test_2() {
        int[] entry = {1,0,0,0,1};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,3);
    }

    @Test
    public void Test_3() {
        int[] entry = {0,0,0,0,1};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,0);
    }

    @Test
    public void Test_4() {
        int[] entry = {1,0,0,0,0};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,0);
    }

    @Test
    public void Test_5() {
        int[] entry = {2,0,0,0,1};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,3);
    }

    @Test
    public void Test_6() {
        int[] entry = {2,1,2,3,2,1,2};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,2);
    }

    @Test
    public void Test_7() {
        int[] entry = {2,1,2,3,4,5,4,3,2,1,2};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,2);
    }

    @Test
    public void Test_8() {
        int[] entry = {1,0,0,0,2};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,3);
    }

    @Test
    public void Test_9() {
        int[] entry = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = waterCounter.countWaterQuantity(entry);

        assertEquals(result,6);
    }
}