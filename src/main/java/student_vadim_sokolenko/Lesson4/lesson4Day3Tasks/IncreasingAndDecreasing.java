package student_vadim_sokolenko.Lesson4.lesson4Day3Tasks;

import java.util.Scanner;

class IncreasingAndDecreasing {

    public static void main(String[] args) {
//        Write a program that accepts three numbers from the user and prints:
//        - "increasing" if the numbers are in increasing order,
//        - "decreasing" if the numbers are in decreasing order,
//        - "Neither increasing or decreasing order" otherwise.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firNum = scan.nextInt();

        System.out.println("Please enter second number: ");
        int secNum = scan.nextInt();

        System.out.println("Please enter third number: ");
        int thirdNum = scan.nextInt();


        if (firNum < secNum && secNum < thirdNum && thirdNum > firNum){
            System.out.println("Numbers are increasing");
        } else if (firNum > secNum && secNum > thirdNum && thirdNum < firNum){
            System.out.println("Numbers are decreasing");
        }else{
            System.out.println("Neither increasing or decreasing order");

        }
    }

}

