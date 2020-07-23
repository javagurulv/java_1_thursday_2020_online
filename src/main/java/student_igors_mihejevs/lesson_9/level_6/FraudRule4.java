package student_igors_mihejevs.lesson_9.level_6;

class FraudRule4 extends FraudRule {
    // The country is Jamaica

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }

}
