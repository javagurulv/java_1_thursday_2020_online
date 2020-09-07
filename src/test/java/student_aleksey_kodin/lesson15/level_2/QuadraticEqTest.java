package student_aleksey_kodin.lesson15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class QuadraticEqTest {
    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    public void calcDiscriminantLessThanZero() {
        String result = quadraticEq.calc(2, 2, 5);
        assertEquals(result, "Equation has no roots");
    }

    @Test
    public void discriminantEqualsZero() {
        String result = quadraticEq.calc(2, 0, 0);
        assertEquals(result, "x = -0.0");
    }

    @Test
    public void discriminantGreaterThanZero() {
        String result = quadraticEq.calc(2, 2, 0);
        assertEquals(result, "x1 = -1.0, x2 = 0.0");
    }
}