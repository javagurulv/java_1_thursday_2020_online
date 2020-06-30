package student_vadims_vladisevs.lesson9.day_5;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return traderCity(t).equals("Sidney");
    }

    private String traderCity(Transaction t){
        return t.getTrader().getCity();
    }
}
