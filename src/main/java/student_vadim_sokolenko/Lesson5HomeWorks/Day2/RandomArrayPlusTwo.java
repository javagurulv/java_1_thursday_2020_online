package student_vadim_sokolenko.Lesson5HomeWorks.Day2;

import java.util.Random;

class RandomArrayPlusTwo {

    public static void main(String[] args) {

        int[] randomNumbers = new int[3];

        Random random = new Random();

        randomNumbers [0] = random.nextInt(10);
        randomNumbers [1] = random.nextInt(10);
        randomNumbers [2] = random.nextInt(10);


        System.out.println("numbers [0] = "+ randomNumbers[0]);
        System.out.println("numbers [1] = "+ randomNumbers[1]);
        System.out.println("numbers [2] = "+ randomNumbers[2]);


        int RandomArray0PlusTwo = randomNumbers[0]+2;
        int RandomArray1PlusTwo = randomNumbers[1]+2;
        int RandomArray2PlusTwo = randomNumbers[2]+2;

        System.out.println("numbers [0] plus two = "+ RandomArray0PlusTwo);
        System.out.println("numbers [1] plus two = "+ RandomArray1PlusTwo);
        System.out.println("numbers [2] plus two = "+ RandomArray2PlusTwo);





    }
}
