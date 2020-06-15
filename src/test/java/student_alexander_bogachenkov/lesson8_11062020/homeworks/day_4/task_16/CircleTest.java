package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_16;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateArea() {
        Circle victim = new Circle("circle", 7);
        double actual = victim.calculateArea();
        double expected = 153.938008;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        Circle victim = new Circle("circle", 7);
        double actual = victim.calculatePerimeter();
        double expected = 43.982288;
        assertEquals(expected, actual, 0.1);
    }
}