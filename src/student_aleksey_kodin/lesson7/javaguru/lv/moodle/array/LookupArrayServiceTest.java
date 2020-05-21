package student_aleksey_kodin.lesson7.javaguru.lv.moodle.array;

class LookupArrayServiceTest {
    private static final int[] array = {1,2,3,4,5};
    private static final int[] emptyArray = new int[0];
    private final LookupArrayService lookupArrayService = new LookupArrayService();

    public static void main(String[] args) {
        LookupArrayServiceTest lookupArrayServiceTest = new LookupArrayServiceTest();
        lookupArrayServiceTest.testFindMax(array);
        lookupArrayServiceTest.testFindMin(array);
        lookupArrayServiceTest.testIndexOf(array);
        lookupArrayServiceTest.testIndexOfMax(array);
        lookupArrayServiceTest.testIndexOfMin(array);
        lookupArrayServiceTest.testIndexOfNumberNotIncludedArray(array);
        lookupArrayServiceTest.testFindMaxZeroLength(emptyArray);
        lookupArrayServiceTest.testFindMinZeroLength(emptyArray);
        lookupArrayServiceTest.testIndexOfZeroLength(emptyArray);
        lookupArrayServiceTest.testIndexOfMaxZeroLength(emptyArray);
        lookupArrayServiceTest.testIndexOfMinZeroLength(emptyArray);
    }
    public void testFindMax(int[] array) {
        int result = lookupArrayService.findMax(array);
        printTestResult(result == 5,"Find Max");
    }
    public void testFindMin(int[] array) {
        int result = lookupArrayService.findMin(array);
        printTestResult(result == 1,"Find Min");
    }
    public void testIndexOf(int[] array) {
        int result = lookupArrayService.indexOf(array,5);
        printTestResult(result == 4,"Find index of");
    }
    public void testIndexOfMax(int[] array) {
        int result = lookupArrayService.indexOfMax(array);
        printTestResult(result == 4,"Find index of Max");
    }
    public void testIndexOfMin(int[] array) {
        int result = lookupArrayService.indexOfMin(array);
        printTestResult(result == 0,"Find index of Min");
    }
    public void testIndexOfNumberNotIncludedArray(int[] array) {
        int result = lookupArrayService.indexOf(array,9);
        printTestResult(result == -1,"No index of");
    }
    public void testFindMaxZeroLength(int[] array) {
        int result = lookupArrayService.findMax(array);
        printTestResult(result == 0,"Find Max [array.length = 0]");
    }
    public void testFindMinZeroLength(int[] array) {
        int result = lookupArrayService.findMin(array);
        printTestResult(result == 0,"Find Min [array.length = 0]");
    }
    public void testIndexOfZeroLength(int[] array) {
        int result = lookupArrayService.indexOf(array,5);
        printTestResult(result == -1,"Find Index [array.length = -1]");
    }
    public void testIndexOfMaxZeroLength(int[] array) {
        int result = lookupArrayService.indexOfMax(array);
        printTestResult(result == -1,"Find Index of Max [array.length = -1]");
    }
    public void testIndexOfMinZeroLength(int[] array) {
        int result = lookupArrayService.indexOfMin(array);
        printTestResult(result == -1,"Find Index of Min [array.length = -1]");
    }
    private void printTestResult(boolean isResultOk,String arrayFunction) {
        if (isResultOk) {
            System.out.println("LightColorDetector test - " + arrayFunction + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + arrayFunction + " = FAIL");
        }
    }
}
