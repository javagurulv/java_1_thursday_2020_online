package student_julija_skopeca.practical_tasks.lesson_6.day_4.task_14_sorting_Ascending;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.sortArrayAscendingTest1();
        test.sortArrayAscendingTest2();
    }

    public void sortArrayAscendingTest1 () {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 3;
        arrayTest[1] = 2;
        arrayTest[2] = 7;

        array.sortAscending(arrayTest);
        if ((arrayTest[0]==2) && (arrayTest[1]==3) && (arrayTest[2]==7)) {
            System.out.println("sortArrayAscendingTest1 - OK");
        } else {System.out.println("sortArrayAscendingTest1 - FAIL");
        }
    }

    public void sortArrayAscendingTest2 () {
        ArrayUtil array = new ArrayUtil();
        int[] arrayTest = array.createArray(3);
        arrayTest[0] = 7;
        arrayTest[1] = 2;
        arrayTest[2] = 2;

        array.sortAscending(arrayTest);
        if ((arrayTest[0]==2) && (arrayTest[1]==2) && (arrayTest[2]==7)) {
            System.out.println("sortArrayAscendingTest2 - OK");
        } else {System.out.println("sortArrayAscendingTest2 - FAIL");
        }
    }

}
