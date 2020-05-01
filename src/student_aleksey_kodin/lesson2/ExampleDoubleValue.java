package student_aleksey_kodin.lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleDoubleValue {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter first double value: ");
            double dFirstValue = (new Scanner(System.in).nextDouble());

            System.out.println("Please enter second double value: ");
            double dSecondValue = (new Scanner(System.in).nextDouble());

            System.out.println(dFirstValue + " + " + dSecondValue + " = " + (dFirstValue + dSecondValue));
            System.out.println(dFirstValue + " - " + dSecondValue + " = " + (dFirstValue - dSecondValue));
            System.out.println(dFirstValue + " * " + dSecondValue + " = " + (dFirstValue * dSecondValue));
            System.out.println(dFirstValue + " / " + dSecondValue + " = " + (dFirstValue / dSecondValue));

        } catch (InputMismatchException e) {
            System.out.println("Please enter Double value or use correct format. After try again");
            System.exit(-1);
        }
    }
}

