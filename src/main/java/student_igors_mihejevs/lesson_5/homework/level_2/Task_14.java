package student_igors_mihejevs.lesson_5.homework.level_2;

class Task_14 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArray(3);
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        System.out.println("Arithmetic mean of all numbers from array : " + myArray.averageNumber(array));
    }

}
