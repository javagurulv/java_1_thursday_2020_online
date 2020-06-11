package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_x.super_task_1;

class Task_27 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(numbers);

        arrayUtil.printArrayToConsole(numbers);

        int maxArrayNum = arrayUtil.findMaxNumber(numbers);

        System.out.println("Maximal array number is " + maxArrayNum);
    }
}
