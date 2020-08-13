package student_igors_mihejevs.lesson_5.homework.level_5;

// import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray(); // test of array creation
        test.shouldFillArrayWithRandomNumbers(); // test of array filling with random numbers
    }

    public void shouldCreateArray() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 10;
        int[] array = myArray.createArray(arrayLength);
        int i = 0;
        while (i < array.length ) {
            i++;
        }
        if (i == arrayLength) System.out.println("Test of array creation - OK");
        else System.out.println("Test of array creation - FAIL");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil myArray = new ArrayUtil();

        boolean testOK = true;
        int arrayLength = 10;
        int[] testArray = myArray.createArray(arrayLength);
        myArray.fillArrayWithRandomNumbers(testArray);
        for (int i = 1; i < arrayLength; i++) {
            if ((testArray[i] < 0) && (testArray[i] > 999)) {
                testOK = false;
                break;
            }
        }
        if (testOK) System.out.println("Test of filling array with random numbers between 0 and 999 - OK");
        else System.out.println("Test of filling array with random numbers between 0 and 999 - FAIL");
    }

}
