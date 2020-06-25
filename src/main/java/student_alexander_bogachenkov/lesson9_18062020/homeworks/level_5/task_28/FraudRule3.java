package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_28;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderCity().equals("Sydney");
    }

}