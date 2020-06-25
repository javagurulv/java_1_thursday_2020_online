package student_aleksey_kodin.lesson9.level6.task_33;

class FraudRule4 extends FraudRule {
    private final String ruleName;

    public FraudRule4(String ruleName) {
        super(ruleName);
        this.ruleName = ruleName;
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().contains("Ямайка")) {
            System.out.println("Transaction from " + t.getTrader().getCountry() + " canceled");
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return ruleName;
    }
}
