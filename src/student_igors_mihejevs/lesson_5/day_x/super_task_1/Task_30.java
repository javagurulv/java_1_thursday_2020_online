package student_igors_mihejevs.lesson_5.day_x.super_task_1;

class Task_30 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArrayOfArbitraryLength();
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        myArray.findOddNumber(array);
    }

}
