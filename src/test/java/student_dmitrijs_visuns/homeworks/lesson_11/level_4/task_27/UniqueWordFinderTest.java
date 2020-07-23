package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_27;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {

    @Test
    public void checkforCorrectUniqueWords () {
        UniqueWordFinder testFinder = new UniqueWordFinder();
        Set<String> testUniqueWordSet = testFinder.find("One    one Two two   three four   FIVE five");

        assertTrue(testUniqueWordSet.size() == 5);
        assertTrue(testUniqueWordSet.contains("one"));
        assertTrue(testUniqueWordSet.contains("two"));
        assertTrue(testUniqueWordSet.contains("three"));
        assertTrue(testUniqueWordSet.contains("four"));
        assertTrue(testUniqueWordSet.contains("five"));

    }
}