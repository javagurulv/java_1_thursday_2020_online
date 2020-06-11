package student_julija_skopeca.practical_tasks.lesson_6.day_3.task_9_findNumberInArray;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.isNumberInArrayTest1();
        test.isNumberInArrayTest2();
        test.isNumberInArrayTest3();
        test.isNumberInArrayTest4();
        test.numberCounterInArrayTest();
    }

    public void isNumberInArrayTest1() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 3;
        arrayTest[2] = 1;

        boolean checkNumber = array.findNumber(arrayTest, 3);
        boolean result = true;
        if (checkNumber == result) {
            System.out.println("isNumberInArray Test1 - OK");
        } else {System.out.println("isNumberInArray Test1 - FAIL");}
    }

    public void isNumberInArrayTest2() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 3;
        arrayTest[2] = 3;

        boolean checkNumber = array.findNumber(arrayTest, 3);
        boolean result = true;
        if (checkNumber == result) {
            System.out.println("isNumberInArray Test2 - OK");
        } else {System.out.println("isNumberInArray Test2 - FAIL");}
    }

    public void isNumberInArrayTest3() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 3;
        arrayTest[1] = 3;
        arrayTest[2] = 3;

        boolean checkNumber = array.findNumber(arrayTest, 3);
        boolean result = true;
        if (checkNumber == result) {
            System.out.println("isNumberInArray Test3 - OK");
        } else {System.out.println("isNumberInArray Test3 - FAIL");}
    }

    public void isNumberInArrayTest4() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 1;
        arrayTest[2] = 1;

        boolean checkNumber = array.findNumber(arrayTest, 3);
        boolean result = false;
        if (checkNumber == result) {
            System.out.println("isNumberInArray Test4 - OK");
        } else {System.out.println("isNumberInArray Test4 - FAIL");}
    }

    public void numberCounterInArrayTest() {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 1;
        arrayTest[2] = 1;

        long checkNumber = array.numberCountinArray(arrayTest, 1);
        long result = 3;
        if (checkNumber == result) {
            System.out.println("numberCounterInArray Test - OK");
        } else {System.out.println("numberCounterInArray Test - FAIL");}
    }


}
