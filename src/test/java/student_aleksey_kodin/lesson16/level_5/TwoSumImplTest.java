package student_aleksey_kodin.lesson16.level_5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class TwoSumImplTest {

	@CodeReviewComment(teacher = "Should be a private field!")
    TwoSum twoSum = new TwoSumImpl();

    @Test
    public void test_1() {
        int[] enterArray = {1, 2, 5, 8, 5};

        List<Integer> result = twoSum.sum(enterArray, 7);
        int firstResult = enterArray[result.get(0)];
        int secondResult = enterArray[result.get(1)];

        assertEquals(firstResult, 2);
        assertEquals(secondResult, 5);
    }

    @Test
    public void test_2() {
        int[] enterArray = {1, 2, 5, 8, 5};

        List<Integer> result = twoSum.sum(enterArray, 3);
        int firstResult = enterArray[result.get(0)];
        int secondResult = enterArray[result.get(1)];

        assertEquals(firstResult, 1);
        assertEquals(secondResult, 2);
    }

    @Test
    public void test_3() {
        int[] enterArray = {1, 2, 5, 8, 5};

        List<Integer> result = twoSum.sum(enterArray, 9);
        int firstResult = enterArray[result.get(0)];
        int secondResult = enterArray[result.get(1)];

        assertEquals(firstResult, 1);
        assertEquals(secondResult, 8);
    }

    @Test
    public void test_4_No_Result() {
        int[] enterArray = {1, 2, 5, 8, 5, 6};

        List<Integer> result = twoSum.sum(enterArray, 4);

        assertEquals(result.size(), 0);
    }
}