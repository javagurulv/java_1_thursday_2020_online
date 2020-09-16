package student_igors_mihejevs.lesson_7.homework.level_6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CopyTest {

    @Test
    public void checkCopyClass() {
        Copy copy = new Copy();
        assertArrayEquals(new int[]{5, 3, 4}, copy.copyInRange(new int[]{5, 3, 8, 4, 0, -5}, 2, 5));
        assertArrayEquals(new int[]{3}, copy.copyInRange(new int[]{3, 6, 8}, 2, 5));
        assertArrayEquals(new int[]{}, copy.copyInRange(new int[]{1, 6, 8}, 2, 5));
    }

}