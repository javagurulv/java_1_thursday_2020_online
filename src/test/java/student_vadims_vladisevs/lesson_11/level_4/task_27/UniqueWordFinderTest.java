package student_vadims_vladisevs.lesson_11.level_4.task_27;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {

    @Test
    public void findV1() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "RanDom randOM woRd Word text text text TExt";
        Set<String> list = uniqueWordFinder.find(text);

        assertEquals(3, list.size());
    }

    @Test
    public void findV2() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "text text text TExt";
        Set<String> list = uniqueWordFinder.find(text);

        assertEquals(1, list.size());
    }

    @Test
    public void findV3() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = " ";
        Set<String> list = uniqueWordFinder.find(text);

        assertEquals(0, list.size());
    }
}