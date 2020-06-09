package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_2;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldCountRepetitions();
        wordServiceTest.shouldSplitByWord();
    }

    public void shouldCountRepetitions() {
        WordService wordService = new WordService();
        int expectedResult = 3;
        String[] words = {"me", "me", "you", "I", "me"};
        int actualResult = wordService.countRepetitions(words, "me");

        if (actualResult == expectedResult) {
            System.out.println("shouldCountRepetitions PASSED");
        } else {
            System.out.println("shouldCountRepetitions FAILED");
        }
    }

    public void shouldSplitByWord() {
        WordService wordService = new WordService();
        String text = "I am coding";
        String[] actualResult = wordService.splitByWord(text);
        String[] expectedResult = {"I", "am", "coding"};

        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println("shouldSplitByWord PASSED");
        } else {
            System.out.println("shouldSplitByWord FAILED");
        }
    }
}
