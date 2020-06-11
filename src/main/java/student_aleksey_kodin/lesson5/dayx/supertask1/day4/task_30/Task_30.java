package student_aleksey_kodin.lesson5.dayx.supertask1.day4.task_30;

class Task_30 {

    public static void main(String[] args) {
        int[] array;  // объявляйте переменные там где вы их первый раз используете!

        ArrayUtil myArray = new ArrayUtil();
        array =myArray.createArray(10);

        myArray.fillArrayWithRandomNumbers(array);

        for (int value: array) {
            if (isOdd(value)) {
                System.out.print(value + " - " + value + " is odd\n");
            } else {
                System.out.print(value + " ------------> " +  "is even\n");
            }
        }
        myArray.printArrayToConsole(array);
    }
    private static boolean isOdd(int rndValue) {
        return rndValue % 2 == 1;
    }
}
