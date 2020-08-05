package student_igors_mihejevs.lesson_5.homework.level_4;

class Task_25 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArray(myArray.enterArrayLength());
        myArray.fillArrayWithUserNumbers(array);
        myArray.printArrayToConsole(array);
    }

}
