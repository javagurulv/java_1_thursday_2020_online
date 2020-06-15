package student_aleksey_kodin.lesson8.dayx.supertask2;

class Multiply extends TwoArgumentMathOperation {
    public Multiply(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
