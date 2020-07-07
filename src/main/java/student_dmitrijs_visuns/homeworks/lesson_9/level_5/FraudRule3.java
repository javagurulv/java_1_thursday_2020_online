package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderCity().toLowerCase().equals("сидней");
    }

}
