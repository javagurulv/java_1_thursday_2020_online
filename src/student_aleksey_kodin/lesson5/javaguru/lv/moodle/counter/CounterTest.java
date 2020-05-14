package student_aleksey_kodin.lesson5.javaguru.lv.moodle.counter;

class CounterTest {
    public static void main(String[] args) {
        CounterTest counterTest = new CounterTest();

        counterTest.testGetValueInitialization();
        counterTest.testGetStepInitialization();
        counterTest.testGetSetValue();
        counterTest.testGetSetStep();
        counterTest.testIncrement();
        counterTest.testDecrement();
        counterTest.testMinValue();
        counterTest.testMaxValue();
        counterTest.testMReset();
    }
    void testGetValueInitialization() {
        Counter counter = new Counter();
        int result = counter.getValue();
        if (result == 0) {
            System.out.println("Test class Counter - get value = 0 after initialization = OK");
        } else {
            System.out.println("Test class Counter - get value = 0 after initialization = FAIL");
        }
    }
    void testGetStepInitialization() {
        Counter counter = new Counter();
        int result = counter.getStep();
        if (result == 1) {
            System.out.println("Test class Counter - get step = 1 after initialization = OK");
        } else {
            System.out.println("Test class Counter - get step = 1 after initialization = FAIL");
        }
    }
    void testGetSetValue() {
        Counter counter = new Counter();
        counter.setValue(5);
        if (counter.getValue() == 5) {
            System.out.println("Test class Counter - set/get value if get value = 5 = OK");
        } else {
            System.out.println("Test class Counter - set/get value if get value = 5 = FAIL");
        }
    }
    void testGetSetStep() {
        Counter counter = new Counter();
        counter.setStep(4);
        if (counter.getStep() == 4) {
            System.out.println("Test class Counter - set/get step if get value = 4 = OK");
        } else {
            System.out.println("Test class Counter - set/get step if get value = 4 = FAIL");
        }
    }
    void testIncrement() {
        Counter counter = new Counter();
        counter.increment();
        if (counter.getValue() == 1) {
            System.out.println("Test class Counter - increment if get value = 1 = OK");
        } else {
            System.out.println("Test class Counter - increment if get value = 1 = FAIL");
        }
    }
    void testDecrement() {
        Counter counter = new Counter();
        counter.decrement();
        if (counter.getValue() == 0) {
            System.out.println("Test class Counter - decrement if get value = 0 = OK");
        } else {
            System.out.println("Test class Counter - decrement if get value = 0 = FAIL");
        }
    }
    void testMinValue() {
        Counter counter = new Counter();
        counter.decrement();
        if (counter.getValue() == 0) {
            System.out.println("Test class Counter - Min value if get value = 0 = OK");
        } else {
            System.out.println("Test class Counter - Min value if get value = 0 = FAIL");
        }
    }
    void testMaxValue() {
        Counter counter = new Counter();
        counter.setValue(100);
        counter.increment();
        if (counter.getValue() == 100) {
            System.out.println("Test class Counter - Max value if get value = 100 = OK");
        } else {
            System.out.println("Test class Counter - Max value if get value = 100 = FAIL");
        }
    }
    void testMReset() {
        Counter counter = new Counter();
        counter.setValue(100);
        counter.setStep(5);
        counter.reset();
        if (counter.getValue() == 0 && counter.getStep() == 1) {
            System.out.println("Test class Counter - Reset value = 0 and step = 1 = OK");
        } else {
            System.out.println("Test class Counter - Reset value = 0 and step = 1 = FAIL");
        }
    }
}