package student_aleksey_kodin.lesson9.level5.task_29;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            System.out.println("Transaction sum " + t.getAmount() + " canceled");
            return true;
        }
        return false;
    }
}
