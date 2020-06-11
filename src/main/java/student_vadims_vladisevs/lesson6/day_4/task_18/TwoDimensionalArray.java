package student_vadims_vladisevs.lesson6.day_4.task_18;


/*
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.

Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.
 */

import java.util.Random;

class TwoDimensionalArray {

    public int arraySum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
               sum += array[i][j];
            }
        }
        return sum;
    }

    public int[][] createArray(int verticalLength, int horizontalLength){
        return new int[verticalLength][horizontalLength];
    }

    public void fillArrayWithRandomNumbers(int[][] array){
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
     }


}
