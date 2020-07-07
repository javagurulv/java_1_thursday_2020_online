package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderCountry().toLowerCase().equals("ямайка");
    }

}
