package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level3;

class SubtractionOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a - b;
    }

    @Override
    public String toString() {
        return "{ SubtractionOperation }";
    }
}
