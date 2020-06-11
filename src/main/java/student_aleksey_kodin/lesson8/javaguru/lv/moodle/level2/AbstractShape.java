package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level2;

abstract class AbstractShape implements Shape {
    private final String title;

    AbstractShape(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return title;
    }
}
