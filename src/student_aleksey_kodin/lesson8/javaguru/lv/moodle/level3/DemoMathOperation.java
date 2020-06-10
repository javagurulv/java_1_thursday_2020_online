package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level3;

class DemoMathOperation {
    public static void main(String[] args) {
        OperationExecutor operationExecutor = new OperationExecutor();

        MathOperation[] mathOperations = { new AdditionOperation(),
                                           new SubtractionOperation(),
                                           new MultiplyOperation(),
                                           new DivisionOperation() };

        operationExecutor.execute(mathOperations,5,5);
    }
}
