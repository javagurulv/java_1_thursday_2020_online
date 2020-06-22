package student_aleksey_kodin.lesson9.level5.task_29;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().contains("Ямайка")) {
            System.out.println("Transaction from " + t.getTrader().getCountry() + " canceled");
            return true;
        }
        return false;
    }
}
