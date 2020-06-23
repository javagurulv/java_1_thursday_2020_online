package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

enum FraudAmount {
    Sum_1(1000000),
    Sum_2(1000);

    private final int fraudAmount;

    FraudAmount(int fraudAmount) {
        this.fraudAmount = fraudAmount;
    }

    public int getValue() {
        return fraudAmount;
    }
}
