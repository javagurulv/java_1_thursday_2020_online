package student_oleg_ivanov.lesson2.homeWork.day2;

import java.util.Scanner;

class UserNameLevel3 {
    public static void main(String[] args) {
        //get name from user
        System.out.println("Please enter your name: ");
        Scanner myInput = new Scanner(System.in);
        String name = myInput.nextLine();
        System.out.println("Hello dear " + name +"!!!");


    }
}
