package student_vadims_vladisevs.lesson5.day_x;


class RandomNumbersArray {
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();

        int[] randomNumbersArray = array.createArray(10);
        array.fillArrayWithRandomNumbers(randomNumbersArray);

        System.out.println("Random numbers array : ");
        array.printArrayToConsole(randomNumbersArray);

        int maxNumber = array.findMaxNumber(randomNumbersArray);
        int minNumber = array.findMinNumber(randomNumbersArray);


        System.out.println("Max number from array : " + maxNumber);
        System.out.println("Min number from array : " + minNumber);

        array.evenNumbersFromArray(randomNumbersArray);
        System.out.println();
        array.oddNumbersFromArray(randomNumbersArray);
    }
}
