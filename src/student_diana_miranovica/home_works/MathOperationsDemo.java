package student_diana_miranovica.home_works;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the Math");

        int a = 26;
        int b = 13;
        int sum1 = a + b;

        System.out.println( "1. Addition + " );
        System.out.print("a");
        System.out.print(" = " );
        System.out.print(a);
        System.out.print(", ");
        System.out.println("b = " + b);


        System.out.println( "a + b = "+ a + " + " + b + " = " + sum1 );

        int sum2 = a - b;

        System.out.println(" ");
        System.out.println( "2. Subtraction -" );
        System.out.print("a");
        System.out.print(" = " );
        System.out.print(a);
        System.out.print(", ");
        System.out.println("b = " + b);

        System.out.println( "a - b = "+ a + " - " + b + " = " + sum2 );

        int sum3 = a / b;

        System.out.println(" ");
        System.out.println( "3. Devision /" );
        System.out.print("a");
        System.out.print(" = " );
        System.out.print(a);
        System.out.print(", ");
        System.out.println("b = " + b);

        System.out.println( "a / b = "+ a + " / " + b + " = " + sum3 );

        int sum4 = a * b;

        System.out.println(" ");
        System.out.println( "4. Multiplication *" );
        System.out.print("a");
        System.out.print(" = " );
        System.out.print(a);
        System.out.print(", ");
        System.out.println("b = " + b);

        System.out.println( "a * b = "+ a + " * " + b + " = " + sum4 );
    }
}
