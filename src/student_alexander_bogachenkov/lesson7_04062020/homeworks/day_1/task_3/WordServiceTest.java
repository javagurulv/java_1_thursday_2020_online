package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_1.task_3;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFindMostFrequentWord();
    }

    public void shouldFindMostFrequentWord() {
        WordService wordService = new WordService();
        String text = "word word word text text book book book book phone phone phone phone";
        String actualResult = wordService.findMostFrequentWord(text);
        String expectedResult = "book";

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldFindMostFrequentWord PASSED");
        } else {
            System.out.println("shouldFindMostFrequentWord FAILED");
        }
    }

}
