package student_vadims_vladisevs.lesson_13.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void add_v1(){
        int actual = calculator.add("1,2");
        assertEquals(3,actual);
    }

    @Test
    public void add_v2(){
        int actual = calculator.add("1,0");
        assertEquals(1,actual);
    }

    @Test
    public void add_v3(){
        int actual = calculator.add(",5");
        assertEquals(5,actual);
    }

    @Test
    public void add_v4(){
        int actual = calculator.add("");
        assertEquals(0,actual);
    }

    @Test
    public void add_v5(){
        int actual = calculator.add("1,2,3");
        assertEquals(6,actual);
    }

    @Test
    public void add_v6(){
        int actual = calculator.add("1,2,3,4");
        assertEquals(10,actual);
    }

    @Test
    public void add_v7(){
        int actual = calculator.add("1\\n23,4");
        assertEquals(10,actual);
    }

    @Test
    public void add_v8(){
        int actual = calculator.add("1\\n");
        assertEquals(1,actual);
    }

    @Test
    public void add_v9(){
        int actual = calculator.add("//[;]\\n1;2");
        assertEquals(3,actual);
    }

    @Test
    public void add_v10(){
        int actual = calculator.add("//[;][&]\\n1;2&3");
        assertEquals(6,actual);
    }

}