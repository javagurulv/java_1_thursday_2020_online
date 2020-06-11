package student_aleksey_kodin.lesson5.dayx.supertask1.day4.task_28;

class Task_28 {

    public static void main(String[] args) {
        int[] array;  // объявляйте переменные там где вы их первый раз используете!

        ArrayUtil myArray = new ArrayUtil();
        array =myArray.createArray(10);

        myArray.fillArrayWithRandomNumbers(array);

        myArray.printArrayToConsole(array);
        int minNumber = myArray.findMinNumber(array);
        System.out.println("Array's min value - " + minNumber);
    }
}