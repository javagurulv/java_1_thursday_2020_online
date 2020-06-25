package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_6.task_32;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTraderCountry().equals("Germany")) && (t.getAmount() > 1000);
    }

}