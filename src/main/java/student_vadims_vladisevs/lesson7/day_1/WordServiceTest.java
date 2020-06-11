package student_vadims_vladisevs.lesson7.day_1;

class WordServiceTest {


    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.textToWordArrayTestV1();
        wordServiceTest.textToWordArrayTestV2();
        wordServiceTest.findWordTestV1();
        wordServiceTest.findWordTestV2();
        wordServiceTest.findMostFrequentWordTestV1();
        wordServiceTest.findMostFrequentWordTestV2();

    }



    public void textToWordArrayTestV1(){
        WordService test = new WordService();
        String[] testArray = test.textToWordArray("1, 2, 3, 4, 5");
        int result = testArray.length;
        printTestResult(5, result, "Text to word array V1");
    }

    public void textToWordArrayTestV2(){
        WordService test = new WordService();
        String[] testArray = test.textToWordArray("Hello! How are you?");
        int result = testArray.length;
        printTestResult(4, result, "Text to word array V2");
    }

    public void findWordTestV1(){
        WordService test = new WordService();
        String[] testArray = test.textToWordArray("Hello, hello! How are you?");
        String result = test.findWord(testArray);
        printTestResult("Hello", result, "Find word V1");
    }

    public void findWordTestV2(){
        WordService test = new WordService();
        String[] testArray = test.textToWordArray("Hello, hello! How how are are are you?");
        String result = test.findWord(testArray);
        printTestResult("are", result, "Find word V2");
    }

    public void findMostFrequentWordTestV1(){
        WordService test = new WordService();
        String result = test.findMostFrequentWord("Hello, hello! How are you?");
        printTestResult("Hello", result, "Find most frequent word V1");
    }

    public void findMostFrequentWordTestV2(){
        WordService test = new WordService();
        String result = test.findMostFrequentWord("Hello, hello! How how are are are you?");
        printTestResult("are", result, "Find most frequent word V2");
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
