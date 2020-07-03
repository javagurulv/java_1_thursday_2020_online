package student_vadims_vladisevs.lesson9.day_6;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return traderCountry(t).equals("Jamaica");
    }
    private String traderCountry(Transaction t){
        return t.getTrader().getCountry();
    }
}
