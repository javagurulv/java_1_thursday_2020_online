package student_vadims_vladisevs.lesson8.day_x.super_task_2;

class MAthOperationDemo {

	public static void main(String[] args) {
//		// build and calculate: 10 + 20
//		Argument arg1 = new Argument(10);
//		Argument arg2 = new Argument(20);
//		MathOperation addition = new Addition(arg1, arg2);
//		System.out.println("Left side Addition result = " + addition.calculate());
//
//		// build and calculate: 50 - 20
//		Argument arg3 = new Argument(50);
//		Argument arg4 = new Argument(20);
//		MathOperation subtraction = new Subtraction(arg3, arg4);
//		System.out.println("Right side Subtraction result = " + addition.calculate());
//
//		// build and calculate: (10 + 20) + (50 - 20)
//		MathOperation addition1 = new Addition(addition, subtraction);
//		System.out.println("Final Addition result = " + addition1.calculate());

		// build and calculate: 10 - 5
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(5);
		MathOperation subtraction = new Subtraction(arg1, arg2);
		System.out.println("Left side Addition result = " + subtraction.calculate());

		// build and calculate: 20 / 5
		Argument arg3 = new Argument(20);
		Argument arg4 = new Argument(5);
		MathOperation division = new Division(arg3, arg4);
		System.out.println("Right side Subtraction result = " + division.calculate());

		// build and calculate: (10 - 5) * (20 / 5)
		MathOperation multiplication = new Multiplication(subtraction, division);
		System.out.println("Final Addition result = " + multiplication.calculate());


	}

}
