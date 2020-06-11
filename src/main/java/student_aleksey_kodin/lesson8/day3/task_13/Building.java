package student_aleksey_kodin.lesson8.day3.task_13;

abstract class Building {
    private final int stage;
    Building(int stage) {
        this.stage = stage;
    }
    abstract void toEntry();

    int getStageCount() {
        return stage;
    }
}
