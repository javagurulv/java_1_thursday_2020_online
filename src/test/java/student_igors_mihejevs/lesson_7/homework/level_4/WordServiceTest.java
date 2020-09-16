package student_igors_mihejevs.lesson_7.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {

    @Test
    public void shouldReturnArrayOfWords() {
        String testString = "one five two three five one five two two five";
        WordService wordService = new WordService();
        assertEquals(wordService.getArrayOfWordsFromString(testString).length, 10);
    }

    @Test
    public void shouldReturnCountOfOneWordFromString() {
        String testString = "one five two three five one five two two five";
        WordService wordService = new WordService();
        assertEquals(wordService.countingSpecificWordInArray(wordService.getArrayOfWordsFromString(testString),"five"), 4);
    }

    @Test
    public void shouldFindMostFrequentWord() {
        String testString = "one five two three five one five two two five";
        WordService wordService = new WordService();
        assertEquals(wordService.findMostFrequentWord(testString),"five");
    }

}