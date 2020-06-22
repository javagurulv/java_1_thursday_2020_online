package student_aleksey_kodin.lesson9.level6.task_30;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().contains("Pokemon")) {
            System.out.println("Transaction from " + t.getTrader().getFullName() + " canceled");
            return true;
        }
        return false;
    }
}
