package student_diana_miranovica.lesson2;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the Math");

        int a = 26;
        int b = 13;
        int sum1 = a + b;

        System.out.println( "1. Addition +" );
        System.out.print("a");
        System.out.print(" = " );
        System.out.print(a);
        System.out.print(", ");
        System.out.println("b = " + b);


        System.out.println( "a + b = "+ a + " + " + b + " = " + sum1 );


        long c = 89;
        long d = 2;

        long sum2 = c - d;

        System.out.println(" ");
        System.out.println( "2. Subtraction -" );
        System.out.print("c");
        System.out.print(" = " );
        System.out.print(c);
        System.out.print(", ");
        System.out.println("d = " + d);

        System.out.println( "c - d = "+ c + " - " + d + " = " + sum2 );

        short e = 180;
        short f = 90;


        System.out.println(" ");
        System.out.println( "3. Devision /" );
        System.out.print("e");
        System.out.print(" = " );
        System.out.print(e);
        System.out.print(", ");
        System.out.println("f = " + f);

        System.out.println( "e / f = "+ e + " / " + f + " = " + (180/90) );

        double m = 2.5;
        double n = 3.14;
        double sum4 = m * n;

        System.out.println(" ");
        System.out.println( "4. Multiplication *" );
        System.out.print("m");
        System.out.print(" = " );
        System.out.print(m);
        System.out.print(", ");
        System.out.println("n = " + n);

        System.out.println( "m * n = "+ m + " * " + n + " = " + sum4 );
    }
}
