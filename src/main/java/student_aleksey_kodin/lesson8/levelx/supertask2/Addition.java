package student_aleksey_kodin.lesson8.levelx.supertask2;

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
