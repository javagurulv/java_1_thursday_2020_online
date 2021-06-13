package student_aleksey_kodin.code_review_analyzer.logic;

import org.junit.Ignore;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

@Ignore("failed on GitHub automatic Build")
public class ClassFinderTest {
    ClassFinder classFinder = new ClassFinder();

    @Test
    public void correctPackage() throws IOException {
        classFinder.findAllClassesInPackage(
                "student_aleksey_kodin.lesson2");

        boolean result = classFinder.isFilePathCorrect();
        assertTrue(result);
    }

    @Test
    public void noCorrectPackage() throws IOException {
        classFinder.findAllClassesInPackage(
                "student_aleksey_kodin.lesson19");

        boolean result = classFinder.isFilePathCorrect();
        assertFalse(result);
    }

}