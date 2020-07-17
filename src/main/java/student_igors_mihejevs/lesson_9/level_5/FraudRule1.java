package student_igors_mihejevs.lesson_9.level_5;

class FraudRule1 extends FraudRule {
    // Full name is Pokemon

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
