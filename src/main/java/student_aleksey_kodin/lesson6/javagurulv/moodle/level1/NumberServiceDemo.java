package student_aleksey_kodin.lesson6.javagurulv.moodle.level1;

import java.util.InputMismatchException;
import java.util.Scanner;

class NumberServiceDemo {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();

        try {
            System.out.println("Please enter start value: ");
            int firstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter finish value: ");

            int secondValue = new Scanner(System.in).nextInt();

            System.out.println("Example method - rangeSum:");
            int sumResult = numberService.rangeSum(firstValue,secondValue);
            System.out.println("Sum of range from " + firstValue + " to " + secondValue + " is: " + sumResult);

            System.out.println("Example method - rangeSumNextVersion:");
            int sumResultNext = numberService.rangeSumNextVersion(firstValue,secondValue);
            System.out.println("Sum of range from " + firstValue + " to " + secondValue + " is: " + sumResultNext);

            System.out.println("Example method - rangeSumRecursion:");
            int sumResultRecursion = numberService.rangeSumRecursion(firstValue,secondValue);
            System.out.println("Sum of range from " + firstValue + " to " + secondValue + " is: " + sumResultRecursion);

            System.out.println("----------------------------------");
            System.out.println("Example method - rangeEvenCount:");
            int evenCount = numberService.rangeEvenCount(firstValue,secondValue);
            System.out.println("Total oven numbers from "+ firstValue + " to " + secondValue + " is: "+ evenCount);

            System.out.println("Example method - rangeEvenCountNextVersion:");
            int evenCountNext = numberService.rangeEvenCountNextVersion(firstValue,secondValue);
            System.out.println("Total oven numbers from "+ firstValue + " to " + secondValue + " is: "+ evenCountNext);

            System.out.println("Example method - rangeEvenCountRecursion:");
            int evenCountRecursion = numberService.rangeEvenCountRecursion(firstValue,secondValue);
            System.out.println("Total oven numbers from "+ firstValue + " to " + secondValue + " is: "+ evenCountRecursion);

        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
