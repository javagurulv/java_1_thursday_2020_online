package student_vadims_vladisevs.lesson9.day_6;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return transactionAmount(t) > 1000000;
    }

    private int transactionAmount(Transaction t){
        return t.getAmount();
    }
}
