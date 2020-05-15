package student_aleksey_kodin.lesson5.javaguru.lv.moodle.counter;

class Counter {
    private int value;
    private int step;
    private static final int MIN_VALUE_COUNTER = 0;
    private static final int MAX_VALUE_COUNTER = 100;
    private static final int MIN_VALUE_STEP = 1;
    private static final int MAX_VALUE_STEP = 10;

    public Counter() {
        this.value = MIN_VALUE_COUNTER;
        this.step = MIN_VALUE_STEP;
    }
    public void increment() {
        if (value < 100) value = value + step;
    }
    public void decrement() {
        if (value > 0) value = value - step;
    }
    public void reset() {
        value = MIN_VALUE_COUNTER;
        step = MIN_VALUE_STEP;
    }
    public void setValue(int value) {
        if (value >= MIN_VALUE_COUNTER && value <= MAX_VALUE_COUNTER) {
                this.value = value;
        }
    }
    public int getValue() {
        return value;
    }
    public void setStep(int step) {
        if (step >= MIN_VALUE_STEP && step <= MAX_VALUE_STEP) {
            this.step = step;
        }
    }
    public int getStep() {
        return  step;
    }
}
