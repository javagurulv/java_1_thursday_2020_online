package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_27;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }

}