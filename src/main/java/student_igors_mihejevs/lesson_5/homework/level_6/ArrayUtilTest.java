package student_igors_mihejevs.lesson_5.homework.level_6;

// import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray(); // test of array creation
        test.shouldFillArrayWithRandomNumbers(); // test of method of filling array with random numbers
        test.shouldFindMaxNumber(); // test of method of finding maximum number in array
        test.shouldFindMinNumber(); // test of method of finding minimum number in array
        test.printArray(); // test of method of finding maximum number in array
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

    public void printArray() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 7;
        int[] testArray = myArray.createArray(arrayLength);
        myArray.fillArrayWithRandomNumbers(testArray);
        System.out.println("Printing array of length " + arrayLength + " filling with random numbers to console");
        myArray.printArrayToConsole(testArray);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 7;
        int[] testArray = myArray.createArray(arrayLength);
        int i = 0;
        while (i < arrayLength ) {
            testArray[i] = i + 1;
            i++;
        }
        if (myArray.findMaxNumber(testArray) == 7) System.out.println("Test of maximum number of array - OK");
        else System.out.println("Test of maximum number of array - FAIL");
    }

    public void shouldFindMinNumber() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 7;
        int[] testArray = myArray.createArray(arrayLength);
        int i = 0;
        while (i < arrayLength ) {
            testArray[i] = i + 1;
            i++;
        }
        if (myArray.findMinNumber(testArray) == 1) System.out.println("Test of minimum number of array - OK");
        else System.out.println("Test of minimum number of array - FAIL");
    }

}
