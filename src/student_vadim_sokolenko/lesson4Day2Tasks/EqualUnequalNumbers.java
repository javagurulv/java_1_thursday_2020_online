package student_vadim_sokolenko.lesson4Day2Tasks;

import java.util.Scanner;

class EqualUnequalNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firsNumber = scan.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scan.nextInt();

        if (firsNumber == secondNumber){
        System.out.println("Numbers are equal");
    }   else{
        System.out.println("Numbers are different");


        }

    }
}
