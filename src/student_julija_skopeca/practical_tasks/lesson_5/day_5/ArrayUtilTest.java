package student_julija_skopeca.practical_tasks.lesson_5.day_5;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
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
}
