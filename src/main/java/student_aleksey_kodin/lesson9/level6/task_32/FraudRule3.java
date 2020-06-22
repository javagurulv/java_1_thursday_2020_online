package student_aleksey_kodin.lesson9.level6.task_32;

public class FraudRule3 extends FraudRule {
    private final String ruleName;

    public FraudRule3(String ruleName) {
        super(ruleName);
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().contains("Сидней")) {
            System.out.println("Transaction from " + t.getTrader().getCity() + " canceled");
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
