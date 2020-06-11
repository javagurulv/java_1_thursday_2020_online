package student_julija_skopeca.practical_tasks.lesson_6.day_4.task_18_TwoDimensionalArray_sum_random;

import java.util.Random;

class TwoDimensionalArray {

    public void fillWithRandom (int[][] array){
        Random random = new Random(10);
        for (int i=0;i < array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNumber = random.nextInt();
                array[i][j] = randomNumber;
            }
        }

    }

    public int sumOfTwoDimArray (int[][] array){
        int summ=0;
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                summ+=array[i][j];
            }
        }
       return summ;
    }
}
//System.out.println(Arrays.deepToString(array));