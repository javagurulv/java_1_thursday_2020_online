package student_aleksey_kodin.lesson8.levelx.supertask2;

 class NewMathOperationDemo {
     public static void main(String[] args) {
         // build and calculate: 10 - 5
         Argument arg1 = new Argument(10);
         Argument arg2 = new Argument(5);
         MathOperation subtraction = new Subtraction(arg1, arg2);
         System.out.println("Left side Subtraction result = " + subtraction.calculate());

         // build and calculate: 20 / 5
         Argument arg3 = new Argument(20);
         Argument arg4 = new Argument(5);
         MathOperation division = new Division(arg3, arg4);
         System.out.println("Right side Division result = " + division.calculate());

         // build and calculate: (10 - 5) * (20 / 5)
         MathOperation multiply = new Multiply(subtraction, division);
         System.out.println("Final Addition result = " + multiply.calculate());
     }
}
