package student_julija_skopeca.home_works;

import java.util.Random;

class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(9);
        int b = randomGenerator.nextInt(3);
        int c = randomGenerator.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a + " + "b + " + "c = " + a + " + " + b + " + "
                + c + " = " + (a+b+c));

    }
}
