package student_igors_mihejevs.lesson_5.homework.level_x.super_task_1;

class Task_28 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArrayOfArbitraryLength();
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        System.out.println("Minimum number from array = " + myArray.findMinNumber(array));
    }

}
