package student_igors_mihejevs.lesson_11.homework.level_4;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UniqueWordFinderTest {

    @Test
    public void shouldReturnUniqueWordsFromString() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        Set<String> setOfFoundWords = uniqueWordFinder.find("Guitar is instrument and Piano is instrument");
        Set<String> expectedWords = new HashSet<>();
        expectedWords.add("Guitar");
        expectedWords.add("Piano");
        expectedWords.add("and");
        expectedWords.add("is");
        expectedWords.add("instrument");
        assertEquals(5, setOfFoundWords.size());
        assertEquals(expectedWords, setOfFoundWords);
    }

}