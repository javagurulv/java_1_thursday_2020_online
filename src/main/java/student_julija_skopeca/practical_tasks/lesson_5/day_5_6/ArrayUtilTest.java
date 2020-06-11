package student_julija_skopeca.practical_tasks.lesson_5.day_5_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMaxNumberV1();
        test.shouldFindMaxNumberV2();
        test.shouldFindMaxNumberZero();
        test.shouldFindMaxNumberNegative();
        test.shouldFindMinNumber();
        test.shouldFindMinNumberNegative();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayNew = new ArrayUtil();
        int [] arrayTest = arrayNew.createArray(3);
        if (arrayTest.length == 3) {
            System.out.println("shouldCreate test - ok");
        } else {
            System.out.println("shouldCreate test - fail");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayNew2 = new ArrayUtil();
        int[] arrayTest2 = arrayNew2.createArray(3);
        arrayNew2.fillArrayWithRandomNumbers(arrayTest2);
        //System.out.println(Arrays.toString(arrayTest2));

        if (arrayTest2.length == 0) {
            System.out.println("shouldFillArrayWithRandomNumbers test - fail");
        } else {
            System.out.println("shouldFillArrayWithRandomNumbers test - ok");
        }
    }

    public void shouldFindMaxNumber() {
        // Write test implementation here !!!
        ArrayUtil arrayMax = new ArrayUtil();
        int[] arrayTest3 = arrayMax.createArray(3);
        arrayTest3[0] = 1;
        arrayTest3[1] = 2;
        arrayTest3[2] = 3;

        int maxNumber = arrayMax.findMaxNumber(arrayTest3);
        if (maxNumber == 3) {
            System.out.println("ShouldFindMaxNumber test - ok");
        } else {System.out.println("ShouldFindMaxNumber test - fail");}

    }

    public void shouldFindMaxNumberV1() {
        // Write test implementation here !!!
        ArrayUtil arrayMax = new ArrayUtil();
        int[] arrayTest3 = arrayMax.createArray(3);
        arrayTest3[0] = 1;
        arrayTest3[1] = 3;
        arrayTest3[2] = 2;

        int maxNumber = arrayMax.findMaxNumber(arrayTest3);
        if (maxNumber == 3) {
            System.out.println("ShouldFindMaxNumberV1 test - ok");
        } else {System.out.println("ShouldFindMaxNumberV1 test - fail");}

    }

    public void shouldFindMaxNumberV2() {
        // Write test implementation here !!!
        ArrayUtil arrayMax = new ArrayUtil();
        int[] arrayTest3 = arrayMax.createArray(3);
        arrayTest3[0] = 3;
        arrayTest3[1] = 2;
        arrayTest3[2] = 2;

        int maxNumber = arrayMax.findMaxNumber(arrayTest3);
        if (maxNumber == 3) {
            System.out.println("ShouldFindMaxNumberV2 test - ok");
        } else {System.out.println("ShouldFindMaxNumberV2 test - fail");}

    }

    public void shouldFindMaxNumberZero() {
        // Write test implementation here !!!
        ArrayUtil arrayMax = new ArrayUtil();
        int[] arrayTest3 = arrayMax.createArray(3);
        arrayTest3[0] = 0;
        arrayTest3[1] = 0;
        arrayTest3[2] = 0;

        int maxNumber = arrayMax.findMaxNumber(arrayTest3);
        if (maxNumber == 0) {
            System.out.println("ShouldFindMaxNumberZero test - ok");
        } else {System.out.println("ShouldFindMaxNumberZero test - fail");}

    }

    public void shouldFindMaxNumberNegative() {
        // Write test implementation here !!!
        ArrayUtil arrayMax = new ArrayUtil();
        int[] arrayTest3 = arrayMax.createArray(3);
        arrayTest3[0] = -1;
        arrayTest3[1] = -2;
        arrayTest3[2] = -3;

        int maxNumber = arrayMax.findMaxNumber(arrayTest3);
        if (maxNumber == -1) {
            System.out.println("ShouldFindMaxNumberNegative test - ok");
        } else {System.out.println("ShouldFindMaxNumberNegative test - fail");}

    }

        public void shouldFindMinNumber() {
        // Write test implementation here !!!
        ArrayUtil arrayMin = new ArrayUtil();
        int[] arrayTest3 = arrayMin.createArray(3);
        arrayTest3[0] = 1;
        arrayTest3[1] = 2;
        arrayTest3[2] = 3;

        int minNumber = arrayMin.findMinNumber(arrayTest3);
        if (minNumber == 1) {
            System.out.println("shouldFindMinNumber test - ok");
        } else {System.out.println("shouldFindMinNumber test - fail");}
    }

    public void shouldFindMinNumberNegative() {
        // Write test implementation here !!!
        ArrayUtil arrayMin = new ArrayUtil();
        int[] arrayTest3 = arrayMin.createArray(3);
        arrayTest3[0] = -1;
        arrayTest3[1] = -2;
        arrayTest3[2] = -3;

        int minNumber = arrayMin.findMinNumber(arrayTest3);
        if (minNumber == -3) {
            System.out.println("shouldFindMinNumberNegative test - ok");
        } else {System.out.println("shouldFindMinNumberNegative test - fail");}
    }
}
