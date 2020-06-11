package student_igors_mihejevs.lesson_7.day_4;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        String testString = "one five two three five one five two two five";

        wordServiceTest.shouldReturnArrayOfWords(testString);
        wordServiceTest.shouldReturnCountOfOneWordFromString(testString);
        wordServiceTest.shouldFindMostFrequentWord(testString);
    }

    public void shouldReturnArrayOfWords(String testString) {
        WordService wordService = new WordService();
        printingTestResult(wordService.getArrayOfWordsFromString(testString).length == 10,
                "Test of creating of array of words");
    }

    public void shouldReturnCountOfOneWordFromString(String testString) {
        WordService wordService = new WordService();
        printingTestResult(wordService.countingSpecificWordInArray(wordService.getArrayOfWordsFromString(testString), "five") == 4,
                "Test of returning count of word");
    }

    public void shouldFindMostFrequentWord(String testString) {
        WordService wordService = new WordService();
        printingTestResult(wordService.findMostFrequentWord(testString).equals("five"),
                "Test of finding the most frequent word");
    }

    public void printingTestResult(boolean testIsOK, String nameOfTest) {
        if (testIsOK) System.out.println(nameOfTest + " - OK");
        else System.out.println(nameOfTest + " - FAIL");
    }

}
