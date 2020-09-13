package student_igors_mihejevs.lesson_7.homework.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();

        wordServiceTest.shouldReturnArrayOfWords();
        wordServiceTest.shouldReturnCountOfOneWordFromString();
        wordServiceTest.shouldFindMostFrequentWord();
    }

    public void shouldReturnArrayOfWords() {
        WordService wordService = new WordService();
        String testString = "one five two three five one five two two five";
        if (wordService.getArrayOfWordsFromString(testString).length == 10)
            System.out.println("Test of creating of array of words - OK");
        else System.out.println("Test of creating off array of words - FAIL");
    }

    public void shouldReturnCountOfOneWordFromString() {
        WordService wordService = new WordService();
        String testString = "one five two three five one five two two five";
        if (wordService.countingSpecificWordInArray(wordService.getArrayOfWordsFromString(testString),
                "five") == 4)
            System.out.println("Test of returning count of word - OK");
        else System.out.println("Test of returning count of word - FAIL");
    }

    public void shouldFindMostFrequentWord() {
        WordService wordService = new WordService();
        String testString = "one five two three five one five two two five";
        if (wordService.findMostFrequentWord(testString).equals("five"))
            System.out.println("Test of finding the most frequent word - OK");
        else System.out.println("Test of finding the most frequent word - FAIL");
    }

}
