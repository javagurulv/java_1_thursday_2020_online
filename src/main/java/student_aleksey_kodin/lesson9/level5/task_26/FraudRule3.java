package student_aleksey_kodin.lesson9.level5.task_26;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().contains("Сидней")) {
            System.out.println("Transaction from " + t.getTrader().getCity() + " canceled");
            return true;
        }
        return false;
    }
}
