package student_aleksey_kodin.lesson16.level_7;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SkylineTest {
    SkylineImpl skylineImpl = new SkylineImpl();

    @Test
    public void Test_1() {
        Rectangle r1 = new Rectangle(0, 8, 3);
        Rectangle r2 = new Rectangle(4, 8, 5);

        List<Rectangle> entry = new ArrayList<>();
        entry.add(r2);
        entry.add(r1);

        List<Integer> result = skylineImpl.checkSkyline(entry);
        assertEquals(java.util.Optional.ofNullable(result.get(0)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(1)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(2)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(3)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(4)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(5)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(6)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(7)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(8)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(9)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(10)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(11)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(12)), Optional.of(9));
        assertEquals(java.util.Optional.ofNullable(result.get(13)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(14)), Optional.of(9));
        assertEquals(java.util.Optional.ofNullable(result.get(15)), Optional.of(0));

        System.out.println("Test_1: " + skylineImpl.toString());
    }

    @Test
    public void Test_2() {
        Rectangle r1 = new Rectangle(0, 8, 3);
        Rectangle r2 = new Rectangle(1, 6, 3);

        List<Rectangle> entry = new ArrayList<>();
        entry.add(r1);
        entry.add(r2);

        List<Integer> result = skylineImpl.checkSkyline(entry);
        assertEquals(java.util.Optional.ofNullable(result.get(0)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(1)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(2)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(3)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(4)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(5)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(6)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(7)), Optional.of(6));
        assertEquals(java.util.Optional.ofNullable(result.get(8)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(9)), Optional.of(6));
        assertEquals(java.util.Optional.ofNullable(result.get(10)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(11)), Optional.of(0));

        System.out.println("Test_2: " + skylineImpl.toString());
    }

    @Test
    public void Test_3() {
        Rectangle r1 = new Rectangle(1, 2, 4);
        Rectangle r2 = new Rectangle(3, 4, 2);

        List<Rectangle> entry = new ArrayList<>();
        entry.add(r2);
        entry.add(r1);

        List<Integer> result = skylineImpl.checkSkyline(entry);
        assertEquals(java.util.Optional.ofNullable(result.get(0)), Optional.of(1));
        assertEquals(java.util.Optional.ofNullable(result.get(1)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(2)), Optional.of(1));
        assertEquals(java.util.Optional.ofNullable(result.get(3)), Optional.of(2));
        assertEquals(java.util.Optional.ofNullable(result.get(4)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(5)), Optional.of(2));
        assertEquals(java.util.Optional.ofNullable(result.get(6)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(7)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(8)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(9)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(10)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(11)), Optional.of(0));

        System.out.println("Test_3: " + skylineImpl.toString());
    }

    @Test
    public void Test_4() {
        Rectangle r1 = new Rectangle(5, 1, 3);
        Rectangle r2 = new Rectangle(6, 5, 1);

        List<Rectangle> entry = new ArrayList<>();
        entry.add(r2);
        entry.add(r1);

        List<Integer> result = skylineImpl.checkSkyline(entry);
        assertEquals(java.util.Optional.ofNullable(result.get(0)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(1)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(2)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(3)), Optional.of(1));
        assertEquals(java.util.Optional.ofNullable(result.get(4)), Optional.of(6));
        assertEquals(java.util.Optional.ofNullable(result.get(5)), Optional.of(1));
        assertEquals(java.util.Optional.ofNullable(result.get(6)), Optional.of(6));
        assertEquals(java.util.Optional.ofNullable(result.get(7)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(8)), Optional.of(7));
        assertEquals(java.util.Optional.ofNullable(result.get(9)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(10)), Optional.of(7));
        assertEquals(java.util.Optional.ofNullable(result.get(11)), Optional.of(1));
        assertEquals(java.util.Optional.ofNullable(result.get(12)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(13)), Optional.of(1));
        assertEquals(java.util.Optional.ofNullable(result.get(14)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(15)), Optional.of(0));

        System.out.println("Test_4: " + skylineImpl.toString());
    }

    @Test
    public void Test_5() {
        Rectangle r1 = new Rectangle(4, 2, 2);
        Rectangle r2 = new Rectangle(5, 3, 3);
        Rectangle r3 = new Rectangle(7, 4, 1);

        List<Rectangle> entry = new ArrayList<>();
        entry.add(r2);
        entry.add(r3);
        entry.add(r1);

        List<Integer> result = skylineImpl.checkSkyline(entry);
        assertEquals(java.util.Optional.ofNullable(result.get(0)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(1)), Optional.of(0));
        assertEquals(java.util.Optional.ofNullable(result.get(2)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(3)), Optional.of(2));
        assertEquals(java.util.Optional.ofNullable(result.get(4)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(5)), Optional.of(2));
        assertEquals(java.util.Optional.ofNullable(result.get(6)), Optional.of(5));
        assertEquals(java.util.Optional.ofNullable(result.get(7)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(8)), Optional.of(7));
        assertEquals(java.util.Optional.ofNullable(result.get(9)), Optional.of(3));
        assertEquals(java.util.Optional.ofNullable(result.get(10)), Optional.of(7));
        assertEquals(java.util.Optional.ofNullable(result.get(11)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(12)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(13)), Optional.of(4));
        assertEquals(java.util.Optional.ofNullable(result.get(14)), Optional.of(8));
        assertEquals(java.util.Optional.ofNullable(result.get(15)), Optional.of(0));

        System.out.println("Test_5: " + skylineImpl.toString());
    }
}