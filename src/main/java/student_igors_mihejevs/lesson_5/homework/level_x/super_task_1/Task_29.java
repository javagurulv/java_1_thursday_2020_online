package student_igors_mihejevs.lesson_5.homework.level_x.super_task_1;

class Task_29 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArrayOfArbitraryLength();
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        myArray.findEvenNumber(array);
    }

}
