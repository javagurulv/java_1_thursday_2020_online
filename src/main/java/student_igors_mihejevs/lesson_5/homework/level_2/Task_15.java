package student_igors_mihejevs.lesson_5.homework.level_2;

class Task_15 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArray(3);
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        myArray.increaseEveryNumberByTwo(array);
        System.out.println("After increasing by 2 :");
        myArray.printArrayToConsole(array);
    }

}
