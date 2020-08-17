package student_igors_mihejevs.lesson_8.homework.level_x.super_task_2;

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
