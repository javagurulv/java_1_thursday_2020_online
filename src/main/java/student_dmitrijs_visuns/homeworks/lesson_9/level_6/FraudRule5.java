package student_dmitrijs_visuns.homeworks.lesson_9.level_6;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTraderCountry().toLowerCase().equals("германия")
                && t.getAmount() > 1000);
    }

}