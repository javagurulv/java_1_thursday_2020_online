package student_igors_mihejevs.lesson_6.homework.level_3;

// import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        // test.shouldCreateArray(); // test of array creation
        // test.shouldFillArrayWithRandomNumbers(); // test of method of filling array with random numbers
        // test.shouldFindMaxNumber(); // test of method of finding maximum number in array
        // test.shouldFindMinNumber(); // test of method of finding minimum number in array
        // test.printArray(); // test of method of printing array to console
        test.shouldFindSpecifiedNumber(); //if array contains the specified number
        test.shouldFindQuantityOfSpecifiedNumber(); //if array contains the specified number
        test.shouldReplaceSpecifiedNumber(); //if array contains the specified number, replace first
        test.shouldReplaceAllSpecifiedNumber(); //if array contains the specified numbers, replace all of them
        test.shouldFlipArrayOfIntegersNumbers(); //test of method of flipping the array
        test.shouldSortArrayOfIntegersNumbers(); //test of method of sorting the array
    }

    public void shouldReplaceSpecifiedNumber() {
        ArrayUtil myArray = new ArrayUtil();

        int[] testArray = new int[]{3, 7, 5, 9, 5};
        myArray.replace(testArray, 7, 1);
        boolean testOK = true;
        for (int i : testArray) {
            if (i == 7) {
                testOK = false;
                break;
            }
        }
        if (testOK) System.out.println("Test of replacing the first specified number in array - OK");
        else System.out.println("Test of replacing the first specified number in array - FAIL");
    }

    public void shouldReplaceAllSpecifiedNumber() {
        ArrayUtil myArray = new ArrayUtil();

        int[] testArray = new int[]{3, 7, 5, 9, 5};
        myArray.replaceAll(testArray, 5, 1);
        boolean testOK = true;
        for (int i : testArray) {
            if (i == 5) {
                testOK = false;
                break;
            }
        }
        if (testOK) System.out.println("Test of replacing of all specified numbers in array - OK");
        else System.out.println("Test of replacing of all specified numbers in array - FAIL");
    }

    public void shouldFindQuantityOfSpecifiedNumber() {
        ArrayUtil myArray = new ArrayUtil();

        int[] testArray = new int[]{3, 7, 5, 9, 5};
        if (myArray.quantityOfSpecifiedNumber(testArray, 5) == 2)
            System.out.println("Test of counting specified number in array - OK");
        else System.out.println("Test of counting specified number in array - FAIL");
    }

    public void shouldFlipArrayOfIntegersNumbers() {
        ArrayUtil myArray = new ArrayUtil();

        int[] testArray = new int[]{1, 2, 3, 4, 5};
        int[] tempArray = new int[]{1, 2, 3, 4, 5};
        myArray.flipping(testArray);
        boolean testOK = true;
        int j = tempArray.length - 1;
        for (int value : testArray) {
            if (value != tempArray[j]) {
                testOK = false;
                break;
            }
            j--;
        }
        if (testOK) System.out.println("Test of flipping the array - OK");
        else System.out.println("Test of flipping the array - FAIL");
    }

    public void shouldSortArrayOfIntegersNumbers() {
        ArrayUtil myArray = new ArrayUtil();

        int[] testArray = new int[]{7, 1, 5, 9, 2};
        myArray.sorting(testArray);
        boolean testOK = true;
        for (int i = 0; i < testArray.length - 1; i++) {
            if (testArray[i] > testArray[i + 1]) {
                testOK = false;
                break;
            }
        }
        if (testOK) System.out.println("Test of sorting the array - OK");
        else System.out.println("Test of sorting the array - FAIL");
    }

    public void shouldFindSpecifiedNumber() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 5;
        int[] testArray = myArray.createArray(arrayLength);
        int i = 0;
        while (i < arrayLength) {
            testArray[i] = i + 1;
            i++;
        }
        if (myArray.ifArrayContainsSpecifiedNumber(testArray, 4))
            System.out.println("Test of finding specified number in array - OK");
        else System.out.println("Test of finding specified number in array - FAIL");
        if (!myArray.ifArrayContainsSpecifiedNumber(testArray, 7))
            System.out.println("Test of not finding specified number in array - OK");
        else System.out.println("Test of not finding specified number in array - FAIL");
    }

    public void shouldEnterArrayLength() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 10;
        int[] array = myArray.createArray(arrayLength);
        int i = 0;
        while (i < array.length) {
            i++;
        }
        if (i == arrayLength) System.out.println("Test of array creation - OK");
        else System.out.println("Test of array creation - FAIL");
    }

    public void shouldCreateArray() {
        ArrayUtil myArray = new ArrayUtil();

        int arrayLength = 10;
        int[] array = myArray.createArray(arrayLength);
        int i = 0;
        while (i < array.length) {
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
        while (i < arrayLength) {
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
        while (i < arrayLength) {
            testArray[i] = i + 1;
            i++;
        }
        if (myArray.findMinNumber(testArray) == 1) System.out.println("Test of minimum number of array - OK");
        else System.out.println("Test of minimum number of array - FAIL");
    }

}
