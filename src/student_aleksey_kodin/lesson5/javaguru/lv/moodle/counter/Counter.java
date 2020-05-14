package student_aleksey_kodin.lesson5.javaguru.lv.moodle.counter;

class Counter {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }
    public void increment() {
        if (value < 100) value = value + step;
    }
    public void decrement() {
        if (value > 0) value = value - step;
    }
    public void reset() {
        value = 0;
        step = 1;
    }
    public void setValue(int value) {
        if (value >= 0 && value <=100) {
                this.value = value;
        }
    }
    public int getValue() {
        return value;
    }
    public void setStep(int step) {
        if (step >= 1 && step <=10) {
            this.step = step;
        }
    }
    public int getStep() {
        return  step;
    }
}
