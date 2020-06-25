package student_aleksey_kodin.lesson8.level3.task_13;

abstract class Building {
    private final int stage;
    Building(int stage) {
        this.stage = stage;
    }
    abstract void toEntry();

	// название метода и название переменной - лучше чтобы
	// они совпадали, даже такое небольшое различие
	// напрягает читателя, он начинает думать что это разные вещи
    int getStageCount() {
        return stage;
    }
}
