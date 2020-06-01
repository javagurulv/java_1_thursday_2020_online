package student_igors_mihejevs.lesson_5.day_2;

class Task_11 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArray(3);
        myArray.fillArrayWithUserNumbers(array);
        myArray.printArrayToConsole(array);
    }

}
