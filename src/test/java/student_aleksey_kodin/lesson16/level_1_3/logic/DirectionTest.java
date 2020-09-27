package student_aleksey_kodin.lesson16.level_1_3.logic;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DirectionTest {
    Direction direction = new Direction();

    @Test
    public void testRotateLeft_1() {
        Directions result = direction.getDirectionRotateLeft(Directions.N);

        assertEquals(result,Directions.W);
    }

    @Test
    public void testRotateLeft_2() {
        Directions result = direction.getDirectionRotateLeft(Directions.W);

        assertEquals(result,Directions.S);
    }

    @Test
    public void testRotateLeft_3() {
        Directions result = direction.getDirectionRotateLeft(Directions.S);

        assertEquals(result,Directions.E);
    }

    @Test
    public void testRotateLeft_4() {
        Directions result = direction.getDirectionRotateLeft(Directions.E);

        assertEquals(result,Directions.N);
    }

    @Test
    public void testRotateRight_5() {
        Directions result = direction.getDirectionRotateRight(Directions.N);

        assertEquals(result,Directions.E);
    }

    @Test
    public void testRotateRight_6() {
        Directions result = direction.getDirectionRotateRight(Directions.E);

        assertEquals(result,Directions.S);
    }

    @Test
    public void testRotateRight_7() {
        Directions result = direction.getDirectionRotateRight(Directions.S);

        assertEquals(result,Directions.W);
    }

    @Test
    public void testRotateRight_8() {
        Directions result = direction.getDirectionRotateRight(Directions.W);

        assertEquals(result,Directions.N);
    }
}