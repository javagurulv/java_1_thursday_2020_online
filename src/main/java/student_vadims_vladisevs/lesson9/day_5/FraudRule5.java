package student_vadims_vladisevs.lesson9.day_5;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return traderCountry(t).equals("Germany") && transactionAmount(t) > 1000;
    }

    private int transactionAmount(Transaction t){
        return t.getAmount();
    }
    private String traderCountry(Transaction t){
        return t.getTrader().getCountry();
    }
}
