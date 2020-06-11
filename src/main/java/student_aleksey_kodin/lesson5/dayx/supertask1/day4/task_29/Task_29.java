package student_aleksey_kodin.lesson5.dayx.supertask1.day4.task_29;

class Task_29 {

    public static void main(String[] args) {
        int[] array;  // объявляйте переменные там где вы их первый раз используете!

        ArrayUtil myArray = new ArrayUtil();
        array =myArray.createArray(10);

        myArray.fillArrayWithRandomNumbers(array);

        for (int value: array) {
            if (isEven(value)) {
                System.out.print(value + " - " + value + " is even\n");
            } else {
                System.out.print(value + " ------------> " +  "is odd\n");
            }
        }
        myArray.printArrayToConsole(array);
    }
    private static boolean isEven(int rndValue) {
        return rndValue % 2 == 0;
    }
}