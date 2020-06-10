package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level2;

class Circle extends AbstractShape {
    private final double radius;
    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
