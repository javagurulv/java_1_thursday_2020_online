package student_aleksey_kodin.lesson2.level2;

import java.util.Random;

class RandomGeneratorDemo {

    public static void main(String[] args) {

        Random clsRnd = new Random();

        int iRndValue1 = clsRnd.nextInt(50);
        int iRndValue2 = clsRnd.nextInt(50);
        int iRndValue3 = clsRnd.nextInt(50);

        int iSum = iRndValue1 + iRndValue2 + iRndValue3;

        System.out.println("First random number - " + iRndValue1);
        System.out.println("Second random number - " + iRndValue2);
        System.out.println("Third random number - " + iRndValue3);

        System.out.println("The Sum is - " + iRndValue1 + " + " + iRndValue2 + " + " + iRndValue3 + " = " + iSum);

    }
}
