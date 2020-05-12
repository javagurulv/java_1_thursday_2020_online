package student_oleg_ivanov.lesson2.homeWork.day3;

import java.util.Scanner;

class Multiplication {
    public static void main(String[] args){
        //get number from user
        System.out.println("Please enter your number:");
        Scanner myInput = new Scanner(System.in);
        int a = myInput.nextInt();

        //user number "a" multiplication up to 10
        int result1 = a * 1;
        int result2 = a * 2;
        int result3 = a * 3;
        int result4 = a * 4;
        int result5 = a * 5;
        int result6 = a * 6;
        int result7 = a * 7;
        int result8 = a * 8;
        int result9 = a * 9;
        int result10 = a * 10;

        System.out.println(a + " * 1 = " + result1);
        System.out.println(a + " * 2 = " + result2);
        System.out.println(a + " * 3 = " + result3);
        System.out.println(a + " * 4 = " + result4);
        System.out.println(a + " * 5 = " + result5);
        System.out.println(a + " * 6 = " + result6);
        System.out.println(a + " * 7 = " + result7);
        System.out.println(a + " * 8 = " + result8);
        System.out.println(a + " * 9 = " + result9);
        System.out.println(a + " * 10 = " + result10);
    }

}
