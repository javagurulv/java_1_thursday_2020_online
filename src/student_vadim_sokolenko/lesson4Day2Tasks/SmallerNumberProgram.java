package student_vadim_sokolenko.lesson4Day2Tasks;

import java.util.Scanner;

public class SmallerNumberProgram {

    public static void main(String[] args) {

        int a, b, small;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        a = scan.nextInt();
        b = scan.nextInt();

        if( a < b ) {
            small = a;
        }else{
            small = b;
        }
        System.out.println("Smallest of two numbers is: " + small);

    }
    }

