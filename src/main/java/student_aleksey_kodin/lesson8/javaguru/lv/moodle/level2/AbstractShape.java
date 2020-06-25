package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level2;

abstract class AbstractShape implements Shape {
    private final String title;

    AbstractShape(String title) {
        this.title = title;
    }

	// название метода и название переменной - лучше чтобы
	// они совпадали, даже такое небольшое различие
	// напрягает читателя, он начинает думать что это разные вещи
    @Override
    public String getName() {
        return title;
    }
}
