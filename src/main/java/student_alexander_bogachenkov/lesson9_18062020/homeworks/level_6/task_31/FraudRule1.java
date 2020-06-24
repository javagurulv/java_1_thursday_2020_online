package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_6.task_31;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderFullName().equals("Pokemon");
    }

}