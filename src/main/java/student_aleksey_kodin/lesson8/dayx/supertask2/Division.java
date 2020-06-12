package student_aleksey_kodin.lesson8.dayx.supertask2;

class Division extends TwoArgumentMathOperation {
    public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
