package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level3;

class OperationExecutor {
    void execute(MathOperation[] operations, double a, double b) {

        for (MathOperation operation: operations) {
            double result = operation.compute(a,b);
            System.out.println("Operand a - " + a + " Operand b - " + b);
            System.out.println("Use operation " + operation.toString() + " result is " + result);
        }
    }
}
