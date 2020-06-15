package student_aleksey_kodin.lesson8.levelx.supertask2;

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
