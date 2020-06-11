package student_dmitrijs_visuns.homeworks.lesson_5.day_x;

class Task_28 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] newArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(newArray);
        arrayUtil.printArrayToConsole(newArray);
        arrayUtil.findMinNumber(newArray);

    }

}
