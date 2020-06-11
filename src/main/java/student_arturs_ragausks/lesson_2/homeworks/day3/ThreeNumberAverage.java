package student_arturs_ragausks.lesson_2.homeworks.day3;

import java.util.Scanner;

class ThreeNumberAverage {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number : ");

        int firstNumber = scanner.nextInt();

        System.out.println("Second number : ");

        int secondNumber = scanner.nextInt();

        System.out.println("Third number ; ");

        int thirdNumber = scanner.nextInt();

        int averageResult = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average result : " + averageResult);




    }


}
