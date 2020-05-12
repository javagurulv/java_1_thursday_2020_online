package student_deniss_gindins;
import java.util.Random;

class Math {
    public static void main(String[] args){
        //1. Сгенерировать 3 случайных числа и вывести их на экран.
       // 2. Посчитать сумму этих чисел и вывести результат на экран.

        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt(); //A
        int boundRandom = randomGenerator.nextInt(); //B
        int inboundRandom = randomGenerator.nextInt(); //C
        int sum = boundRandom + unboundRandom + inboundRandom;

        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);
        System.out.println("inboundRandom = " + inboundRandom);
        System.out.println("Sum = " + sum);

    }
}
