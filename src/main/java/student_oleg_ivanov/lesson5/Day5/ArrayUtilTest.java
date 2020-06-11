package student_oleg_ivanov.lesson5.Day5;

import java.util.Random;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayNew = new ArrayUtil();
        int[] testArray = arrayNew.createArray(5);
        System.out.println("Array Length " + testArray.length);
        int result = testArray.length;
        if (result == 5) {
            System.out.println("Array Test OK");
        } else {
            System.out.println("Fail");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayNew = new ArrayUtil();
        int[] testArray = arrayNew.createArray(5);
        arrayNew.fillArrayWithRandomNumbers(testArray);
        System.out.println("Random number from 0 to 20");

        int result = 0;
        for (int i = 0; i < testArray.length; i++) {
            result += testArray[i]; // result = result + testArray [i]
        }
        if (result > 0){
            System.out.println("Random Test OK");
        } else {
            System.out.println("Fail");
        }
    }
}