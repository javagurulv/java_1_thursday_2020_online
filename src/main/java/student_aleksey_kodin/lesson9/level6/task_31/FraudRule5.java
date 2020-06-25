package student_aleksey_kodin.lesson9.level6.task_31;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
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
}
