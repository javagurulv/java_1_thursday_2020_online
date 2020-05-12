package student_aleksey_kodin.lesson2.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {
        try {
            System.out.println("Please enter first int value: ");
            //зачем префикс i? итак по типу данных видно, что это целое число
            int iFirstValue = new Scanner(System.in).nextInt();

            System.out.println("Please enter second int value: ");
            //зачем префикс i? итак по типу данных видно, что это целое число
            int iSecondValue = new Scanner(System.in).nextInt();

            System.out.println(iFirstValue + " + " + iSecondValue + " = " + (iFirstValue + iSecondValue));
            System.out.println(iFirstValue + " - " + iSecondValue + " = " + (iFirstValue - iSecondValue));
            System.out.println(iFirstValue + " * " + iSecondValue + " = " + (iFirstValue * iSecondValue));
            System.out.println(iFirstValue + " / " + iSecondValue + " = " + (iFirstValue / iSecondValue));

        } catch (ArithmeticException e) { // класс что вы знаете обработку исключений
            System.out.println("You should not divide a number by zero");
            System.exit(-1);
        } catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
