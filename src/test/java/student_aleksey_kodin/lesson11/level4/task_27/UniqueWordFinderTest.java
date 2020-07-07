package student_aleksey_kodin.lesson11.level4.task_27;

import org.junit.Test;

import java.util.Set;
import static org.junit.Assert.*;

public class UniqueWordFinderTest {
    UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

    @Test
    public void find_1() {
        String testString = "Text Text text Test Test test";
        Set<String > result = uniqueWordFinder.find(testString);
        int size = result.size();

        assertEquals(4,size);
    }

    @Test
    public void find_2() {
        String testString = "One one Two two Tree three Four four";
        Set<String > result = uniqueWordFinder.find(testString);
        int size = result.size();

        assertEquals(8,size);
    }

    @Test
    public void find_3() {
        String testString = "One one Two two One one Two two";
        Set<String > result = uniqueWordFinder.find(testString);
        int size = result.size();

        assertEquals(4,size);
    }

    @Test
    public void find_4() {
        String testString = "Test Test";
        Set<String > result = uniqueWordFinder.find(testString);
        int size = result.size();

        assertEquals(1,size);
    }

    @Test
    public void find_5() {
        String testString = "";
        Set<String > result = uniqueWordFinder.find(testString);
        int size = result.size();

        assertEquals(0,size);
    }

    @Test
    public void find_6() {
        String testString = " ";
        Set<String > result = uniqueWordFinder.find(testString);
        int size = result.size();

        assertEquals(0,size);
    }
}