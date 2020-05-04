package student_edgars_lukjanskis.homeWorks.day_3;


import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Circle radius ");
        double radius = s.nextDouble();
        System.out.println("Circle Area " + radius * radius * Math.PI );
        System.out.println("Circle perimeter " + 2*(radius * Math.PI));
    }

    }


