package student_diana_miranovica.lesson4.homeworks.day_1;

import java.util.InputMismatchException;
import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//целое число и выводит на консоль чётное оно или нет.
//
//Подсказка: используйте для определения чётное число или нет
//операцию остаток от деления (%). Если остаток от деления на 2
//равен нулю то число чётное, иначе не чётное.
 class EvenOrNotEvenTask4 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press int value please");
            int firstNumber = sc.nextInt();

            if (firstNumber % 2 == 0) {
                System.out.println("Your value is EVEN");

            } else {
                System.out.println("Your value is NOT EVEN");
            }
        }catch(InputMismatchException e ){
                System.out.println("Please enter Int value and try again");
                System.exit(0);
            }

    }
}
