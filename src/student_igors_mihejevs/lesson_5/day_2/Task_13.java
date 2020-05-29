package student_igors_mihejevs.lesson_5.day_2;

class Task_13 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArray(3);
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        System.out.println("Sum of all numbers from array : " + myArray.sumOfAllNumbers(array));
    }

}
