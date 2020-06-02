package student_aleksey_kodin.lesson5.dayx.supertask1.day4.task_27;

class Task_27 {

    public static void main(String[] args) {
        int[] array;  // объявляйте переменные там где вы их первый раз используете!

        ArrayUtil myArray = new ArrayUtil();
        array =myArray.createArray(10);

        myArray.fillArrayWithRandomNumbers(array);

        myArray.printArrayToConsole(array);
        int maxNumber = myArray.findMaxNumber(array);
        System.out.println("Array's max value - " + maxNumber);
    }
}