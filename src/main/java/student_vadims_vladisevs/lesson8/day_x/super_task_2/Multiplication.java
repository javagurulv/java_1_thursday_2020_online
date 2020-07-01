package student_vadims_vladisevs.lesson8.day_x.super_task_2;

class Multiplication extends TwoArgumentMathOperation {

    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
