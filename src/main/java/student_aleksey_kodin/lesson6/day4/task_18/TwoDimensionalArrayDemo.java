package student_aleksey_kodin.lesson6.day4.task_18;

class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] testArray = twoDimensionalArray.createTwoDimensionalArray(3,3);

        twoDimensionalArray.addRandomValueArray(testArray);
        int sum = twoDimensionalArray.sumArray(testArray);
        twoDimensionalArray.printArray(testArray);
        System.out.println("Sum = " + sum);

    }
}
