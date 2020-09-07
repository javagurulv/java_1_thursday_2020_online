package teacher.lesson_8.homework.level_7_senior.super_task_2;

class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument,
					MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}
