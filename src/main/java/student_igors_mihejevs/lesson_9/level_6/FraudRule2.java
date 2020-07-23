package student_igors_mihejevs.lesson_9.level_6;

class FraudRule2 extends FraudRule {
    // Amount of transaction is more than 1000000

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }

}
