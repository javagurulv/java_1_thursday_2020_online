package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level2;

class Rectangle extends AbstractShape{
    private final double baseA;
    private final double baseB;

    Rectangle(double baseA, double baseB) {
        super("Rectangle");
        this.baseA = baseA;
        this.baseB = baseB;
    }
    @Override
    public double getArea() {
        return baseA * baseB;
    }
}
