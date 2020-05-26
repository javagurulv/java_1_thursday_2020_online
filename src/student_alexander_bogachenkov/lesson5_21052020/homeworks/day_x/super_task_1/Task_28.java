package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_x.super_task_1;

class Task_28 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(numbers);

        arrayUtil.printArrayToConsole(numbers);

        int minArrayNum = arrayUtil.findMinNumber(numbers);

        System.out.println("Minimal array number is " + minArrayNum);
    }
}
