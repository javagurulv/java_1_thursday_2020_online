package student_julija_skopeca.practical_tasks.lesson_6.day_3.task_12_ReplaceOfNumbersInALLArray;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.numberToReplaceTest1 ();
        test.numberToReplaceTest2 ();
    }

    public void numberToReplaceTest1 () {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest[2] = 3;

       array.replace(arrayTest, 1,10);
       boolean checkNumber = array.findNumber(arrayTest, 10);
       boolean result = true;
        if (checkNumber == result) {
            System.out.println("numberToReplaceTest - OK");
        } else {System.out.println("numberToReplaceTest - FAIL");}
    }

    public void numberToReplaceTest2 () {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 1;
        arrayTest[2] = 3;

        array.replace(arrayTest, 1,10);
        long checkNumber = array.numberCountinArray(arrayTest, 10);
        long result = 2;
        if (checkNumber == result) {
            System.out.println("numberCounterInArray Test2 - OK");
        } else {System.out.println("numberCounterInArray Test2 - FAIL");}
    }

}
