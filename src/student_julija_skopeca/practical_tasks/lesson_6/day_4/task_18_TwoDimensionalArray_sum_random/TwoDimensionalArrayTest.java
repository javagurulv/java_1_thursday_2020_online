package student_julija_skopeca.practical_tasks.lesson_6.day_4.task_18_TwoDimensionalArray_sum_random;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.sumtest1();
    }

    public void sumtest1(){
        TwoDimensionalArray twoDim = new TwoDimensionalArray();
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 1;
        array[1][0] = 1;
        array[1][1] = 1;

        int sumTest = twoDim.sumOfTwoDimArray(array);
        if (sumTest == 4){
            System.out.println("sumtest1 - OK");
        } else {System.out.println("sumtest1 - FAIL");
        }

    }

}
