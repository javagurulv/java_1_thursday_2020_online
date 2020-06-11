package student_vadims_vladisevs.lesson4.homework.day_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scr.nextInt();

        String evenNumber = number + " is even number";
        String oddNumber = number +  " is odd number";
        boolean isEvenNumber = (number % 2 == 0);

        String result = isEvenNumber ? evenNumber : oddNumber;

        System.out.println(result);


    }
}
