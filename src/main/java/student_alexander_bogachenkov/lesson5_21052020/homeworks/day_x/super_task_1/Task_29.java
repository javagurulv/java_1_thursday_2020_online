package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_x.super_task_1;

class Task_29 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(numbers);

        arrayUtil.printArrayToConsole(numbers);

        for (int number : numbers) {
            int residue = number % 2;
            if (residue == 0) {
                System.out.println("Even number from array is " + number);
            }
        }
    }
}
