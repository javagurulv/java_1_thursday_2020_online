package student_vadim_sokolenko.Lesson4.lesson4Day2Tasks;

import java.util.Scanner;

class BiggerNumberProgram {

    public static void main(String[] args) {

        int a, b, big;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        a = scan.nextInt();
        b = scan.nextInt();

    if( a > b ) {
        big = a;
    }else{
        big = b;
    }
        System.out.println("Biggest of two numbers is: " + big);

    }
}
