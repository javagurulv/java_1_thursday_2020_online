package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_2;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldSplitTextInArray();
        wordServiceTest.shouldFindMostFrequentWordInSplittedText();
    }

    public void shouldSplitTextInArray() {
        String[] expectedResult = {"lorem", "ipsum", "dolor", "sit", "amet"};
        WordService wordService = new WordService();
        String[] actualResult = wordService.splitTextInArray("lorem ipsum dolor sit amet");

        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println("shouldSplitTextInArray PASSED");
        } else {
            System.out.println("shouldSplitTextInArray FAILED");
        }
    }

    public void shouldFindMostFrequentWordInSplittedText() {
        String text = "lorem lorem ipsum ipsum ipsum dolor sit sit sit amet";
        String[] splittedText = text.split(" ");
        WordService wordService = new WordService();
        String actualResult = wordService.findMostFrequentWordInSplittedText(splittedText);
        String expectedResult = "ipsum";

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldFindMostFrequentWordInSplittedText PASSED");
        } else {
            System.out.println("shouldFindMostFrequentWordInSplittedText FAILED");
        }
    }
}
