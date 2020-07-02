package student_vadims_vladisevs.lesson9.day_5;

class FraudRule1 extends FraudRule{

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return traderFullName(t).equals("Pokemon");
    }

    private String traderFullName(Transaction t){
        return t.getTrader().getFullName();
    }
}
