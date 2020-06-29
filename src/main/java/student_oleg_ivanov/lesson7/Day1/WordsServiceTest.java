package student_oleg_ivanov.lesson7.Day1;

class WordsServiceTest {
    public static void main(String[] args) {
        WordsServiceTest wordServiceTest = new WordsServiceTest();
        wordServiceTest.wordArrayLength();
        wordServiceTest.mostFrequentWord();

    }
    public void wordArrayLength(){
        WordService test = new WordService();
        String[] testArray = test.textWordArray("1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ");
        int result = testArray.length;
        printTestResult(10, result, " Word array length ");

    }
    public void mostFrequentWord(){
        WordService test = new WordService();
        String result = test.findMostFrequentWord
                ("Big dogs do not like small dogs and small cats");
        printTestResult("dogs", result, " Most frequent word ");

    }
    public void printTestResult(int expectedResult, int result, String testName){
        if (expectedResult == result){
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL! expected result: " + expectedResult + " result: " + result);
        }
    }
    public void printTestResult(String expectedResult, String result, String testName){
        if (expectedResult.equals(result)){
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL! expected result: " + expectedResult + " result: " + result);
        }
    }

}
