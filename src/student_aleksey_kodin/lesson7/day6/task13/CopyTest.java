package student_aleksey_kodin.lesson7.day6.task13;

class CopyTest {
    private static final int[] a1 = {40, 75, 23, 36, 87, 95, 54, 11, 62};
    private static final Copy copy = new Copy();

    public static void main(String[] args) {
        CopyTest copyTest = new CopyTest();
        copyTest.testReturnNewRange(a1,10,20);
    }
    public void testReturnNewRange(int[] referenceArray,int leftBound, int rightBound) {
        int[] result = copy.copyInRange(referenceArray,leftBound,rightBound);
        printTestResult((result[0] == 11) && (result.length == 1),"Return New Range");
    }
    private void printTestResult(boolean isResultOk,String arrayNewRange) {
        if (isResultOk) {
            System.out.println("Copy test - " + arrayNewRange + " = OK");
        } else {
            System.out.println("Copy test - " + arrayNewRange + " = FAIL");
        }
    }
}
