package student_arturs_ragausks.lesson_2.homeworks;

import java.util.Random;

class RandomDemo {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(30);

        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);

    }
}
