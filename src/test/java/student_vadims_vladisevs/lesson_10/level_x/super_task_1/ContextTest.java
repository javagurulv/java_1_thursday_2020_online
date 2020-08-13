package student_vadims_vladisevs.lesson_10.level_x.super_task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void strategyTest_v1() {
        Context context = new Context(new FahrenheitConverter());
        double actual = context.executeStrategy(10);
        assertEquals(50,actual,0.1);
    }

    @Test
    public void strategyTest_v2() {
        Context context = new Context(new KelvinConverter());
        double actual = context.executeStrategy(10);
        assertEquals(283.15,actual,0.1);
    }
}