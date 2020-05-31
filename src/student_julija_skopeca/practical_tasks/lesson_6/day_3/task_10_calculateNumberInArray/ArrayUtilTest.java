package student_julija_skopeca.practical_tasks.lesson_6.day_3.task_10_calculateNumberInArray;

class ArrayUtilTest {

    public static void main(String[] args) {
       ArrayUtilTest test = new ArrayUtilTest();
       test.numberCounterInArrayTest1();
       test.numberCounterInArrayTest2();
       test.numberCounterInArrayTest0();
    }

    public void numberCounterInArrayTest1() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 1;
        arrayTest[2] = 1;

        long checkNumber = array.numberCountinArray(arrayTest, 1);
        long result = 3;
        if (checkNumber == result) {
            System.out.println("numberCounterInArray Test1 - OK");
        } else {System.out.println("numberCounterInArray Test1 - FAIL");}
    }

    public void numberCounterInArrayTest2() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest[2] = 1;

        long checkNumber = array.numberCountinArray(arrayTest, 1);
        long result = 2;
        if (checkNumber == result) {
            System.out.println("numberCounterInArray Test2 - OK");
        } else {System.out.println("numberCounterInArray Test2 - FAIL");}
    }

    public void numberCounterInArrayTest0() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 2;
        arrayTest[1] = 2;
        arrayTest[2] = 2;

        long checkNumber = array.numberCountinArray(arrayTest, 1);
        long result = 0;
        if (checkNumber == result) {
            System.out.println("numberCounterInArray Test0 - OK");
        } else {System.out.println("numberCounterInArray Test0 - FAIL");}
    }

}
