package student_julija_skopeca.practical_tasks.lesson_6.day_3.task_13_replaceNumdersOrderInArray;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.numberToReplaceTest1();
    }

    public void numberToReplaceTest1 () {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest[2] = 3;

        int[] newArrayTest = array.replaceOrderInArray(arrayTest);
        //array.printArrayToConsole(newArrayTest);
        if ((newArrayTest[0]==3) && (newArrayTest[1]==2) && (newArrayTest[2]==1)) {
                System.out.println("numberToReplaceTest1 - OK");
            } else {System.out.println("numberToReplaceTest1 - FAIL");
            }
    }
}
