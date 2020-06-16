package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask7;

class WordServiceTest {

    private static final WordService wordService = new WordService();

    public static void main(String[] args) {
       WordServiceTest wordServiceTest = new WordServiceTest();

        wordServiceTest.printWord();
    }

    private void printWord() {

        printTestResult(wordService.findMostFrequentWord("Это текст просто текст просто просто").equals("просто"),"print word");
    }

    private void printTestResult(boolean isResultOk,String wordServiceTest) {
        if (isResultOk) {
            System.out.println("World Service Test - " + wordServiceTest + " = OK");
        } else {
            System.out.println("World Service Test - " + wordServiceTest + " = FAIL");
        }
    }
}
