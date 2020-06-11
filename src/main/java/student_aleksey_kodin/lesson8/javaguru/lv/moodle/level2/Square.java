package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level2;

class Square extends AbstractShape{
    private final double base;

    Square(double base) {
        super("Square");
      this.base = base;
    }
    @Override
    public double getArea() {
        return base * base;
    }
}
