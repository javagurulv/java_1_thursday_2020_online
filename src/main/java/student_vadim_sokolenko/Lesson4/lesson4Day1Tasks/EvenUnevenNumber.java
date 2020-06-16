package student_vadim_sokolenko.Lesson4.lesson4Day1Tasks;

import java.util.Scanner;

 class EvenUnevenNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number");
        int firstNumber = sc.nextInt();


        if(firstNumber % 2 == 0)
            System.out.println(firstNumber + " is even");
        else
            System.out.println(firstNumber + " is odd");
    }






}
