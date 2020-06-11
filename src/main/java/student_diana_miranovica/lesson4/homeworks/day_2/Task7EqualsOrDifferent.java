package student_diana_miranovica.lesson4.homeworks.day_2;

import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль:
//- "Numbers are equals" - если числа равны
//- "Numbers are different" - если числа не равны
 class Task7EqualsOrDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press your first int value");
        int firstValue = scanner.nextInt();

        System.out.println("Press your second int value");
        int secondValue = scanner.nextInt();

        if(secondValue == firstValue){
            System.out.println("Your numbers are equals!");
        }else {
            System.out.println("Your numbers are different!");
        }
    }
}
