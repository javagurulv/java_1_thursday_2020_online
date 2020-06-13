package student_vadims_vladisevs.lesson7.day_6.Task_13;

class CopyDemo {
    public static void main(String[] args) {
        Copy copy = new Copy();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = copy.copyInRange(array,3,8);

        System.out.println("Result Array : ");
        for (int temp : resultArray){
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println("Array length = " + resultArray.length);
    }
}
