package student_edgars_lukjanskis.homeworks.day_3;


import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Circle radius ");
        double radius = s.nextDouble();

        // старайтесь не делать много операций в одной строке,
        // такие строки кода сложно читать,
        // разбейте на несколько строк, например:
        // double circleArea = radius * radius * Math.PI;
        // System.out.println("Circle Area " + circleArea);
        System.out.println("Circle Area " + radius * radius * Math.PI );
        System.out.println("Circle perimeter " + 2*(radius * Math.PI));
    }

    }


