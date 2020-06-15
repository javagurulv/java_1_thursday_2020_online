package student_aleksey_kodin.lesson8.levelx.supertask2;

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
