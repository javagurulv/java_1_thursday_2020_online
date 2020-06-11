package student_vadim_sokolenko.Lesson5HomeWorks.Day5;

public class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayTest = arrayUtil.createArray(10);
        if (arrayTest.length == 10) {
            System.out.println("Should create array Test - OK");
        } else {
            System.out.println("Should create array Test - Fail");
        }
    }


    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
        ArrayUtil arrayUtil2 = new ArrayUtil();
        int[] arrayTest2 = arrayUtil2.createArray(10);
        arrayUtil2.fillArrayWithRandomNumbers(arrayTest2);

        if (arrayTest2[0] == 0) {
            System.out.println("Should fill with random numbers Test - Fail");
        } else {
            System.out.println("Should fill with random numbers Test - OK");

        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayMax = new ArrayUtil();
        int[] arrayTest3 = arrayMax.createArray(5);
        arrayTest3[0] = 1;
        arrayTest3[1] = 2;
        arrayTest3[2] = 3;
        arrayTest3[3] = 4;
        arrayTest3[4] = 5;


        int maxNumber = arrayMax.findMaxNumber(arrayTest3);
        if (maxNumber == 5) {
            System.out.println("ShouldFindMaxNumber test - OK");
        } else {
            System.out.println("ShouldFindMaxNumber test - FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayMin = new ArrayUtil();
        int[] arrayTest3 = arrayMin.createArray(5);
        arrayTest3[0] = 1;
        arrayTest3[1] = 2;
        arrayTest3[2] = 3;
        arrayTest3[3] = 4;
        arrayTest3[4] = 5;

        int minNumber = arrayMin.findMinNumber(arrayTest3);
        if (minNumber == 1) {
            System.out.println("ShouldFindMaxNumber test - OK");
        } else {
            System.out.println("ShouldFindMaxNumber test - FAIL");
        }
    }
}






