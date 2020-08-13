package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_4.task_27;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {

    @Test
    public void shouldFindUniqueWords() {
        UniqueWordFinder wordFinder = new UniqueWordFinder();
        Set<String> actual = wordFinder.find("Lorem lorem ipsum Dolor sit amet");
        Set<String> expected = new HashSet<>();
        expected.add("lorem");
        expected.add("ipsum");
        expected.add("dolor");
        expected.add("sit");
        expected.add("amet");
        assertEquals(expected, actual);
    }
}