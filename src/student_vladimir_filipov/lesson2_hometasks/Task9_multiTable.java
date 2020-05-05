package student_vladimir_filipov.lesson2_hometasks;

import java.util.Scanner;

public class Task9_multiTable {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter Your number: ");
        int n = myInput.nextInt();

        System.out.println("Multiplication table of " + n);

        for (int x = 1; x <= 10; x++);

        System.out.println(n + " x " + 1 + " = " + (n));
        System.out.println(n + " x " + 2 + " = " + (n*2));
        System.out.println(n + " x " + 3 + " = " + (n*3));
        System.out.println(n + " x " + 4 + " = " + (n*4));
        System.out.println(n + " x " + 5 + " = " + (n*5));
        System.out.println(n + " x " + 6 + " = " + (n*6));
        System.out.println(n + " x " + 7 + " = " + (n*7));
        System.out.println(n + " x " + 8 + " = " + (n*8));
        System.out.println(n + " x " + 9 + " = " + (n*9));
        System.out.println(n + " x " + 10 + " = " + (n*10));

        }
    }

