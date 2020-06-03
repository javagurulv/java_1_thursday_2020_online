package student_aleksey_kodin.lesson7.day1.task_2;

class WordServiceTest {

    private static final WordService wordService = new WordService();
    private String[] resultArrayConvertString;
    private int[] wordCountArray;
    private int max;

    public static void main(String[] args) {
       WordServiceTest wordServiceTest = new WordServiceTest();

        wordServiceTest.testConvertStringToWordArray();
        wordServiceTest.testCountEachWorld();
        wordServiceTest.testGetMaxIndex();
        wordServiceTest.printWord();
    }

    private void testConvertStringToWordArray(){
        resultArrayConvertString = wordService.convertStringToWordArray("Это текст просто текст просто просто");
        printTestResult(resultArrayConvertString[0].equals("Это") && resultArrayConvertString[5].equals("просто"),"Convert to String Array");
    }
    private void testCountEachWorld() {
        wordCountArray = new int[resultArrayConvertString.length];
        wordService.countEachWorld(wordCountArray,resultArrayConvertString);
        printTestResult(wordCountArray[0] == 1 && wordCountArray[5] == 3,"Count word Numbers");
    }
    private void testGetMaxIndex() {
        max = wordService.getIndexMaxCount(wordCountArray);
        printTestResult(max == 5,"Get Index word with max count");
    }
    private void printWord() {
        printTestResult(resultArrayConvertString[max].equals("просто"),"print word");
    }


    private void printTestResult(boolean isResultOk,String wordServiceTest) {
        if (isResultOk) {
            System.out.println("World Service Test - " + wordServiceTest + " = OK");
        } else {
            System.out.println("World Service Test - " + wordServiceTest + " = FAIL");
        }
    }
}
