package student_aleksey_kodin.lesson9.level6.task_33;

class FraudRule5 extends FraudRule {
    private final String ruleName;

    public FraudRule5(String ruleName) {
        super(ruleName);
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().contains("Германия") && (t.getAmount() > 1000)) {
            System.out.println("Transaction from " + t.getTrader().getCountry() + " and sum more " +
                    t.getAmount() + " canceled");
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
