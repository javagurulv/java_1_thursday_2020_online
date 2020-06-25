package student_aleksey_kodin.lesson9.level6.task_32;

class FraudRule2 extends FraudRule {
    private final String ruleName;

    public FraudRule2(String ruleName) {
        super(ruleName);
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            System.out.println("Transaction sum " + t.getAmount() + " canceled");
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
