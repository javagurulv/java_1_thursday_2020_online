package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_28;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderCountry().equals("Jamaica");
    }

}