package student_igors_mihejevs.lesson_5.homework.level_4;

class Task_27 {

    public static void main(String[] args) {
        ArrayUtil myArray = new ArrayUtil();

        int[] array = myArray.createArrayOfArbitraryLength();
        myArray.fillArrayWithRandomNumbers(array);
        myArray.printArrayToConsole(array);
        System.out.println("Maximum number from array = " + myArray.findMaxNumber(array));
    }

}
