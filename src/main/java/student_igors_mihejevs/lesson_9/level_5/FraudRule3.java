package student_igors_mihejevs.lesson_9.level_5;

class FraudRule3 extends FraudRule {
    // The city is Sydney

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }

}
