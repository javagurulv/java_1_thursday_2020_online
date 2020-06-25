package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_5.task_23;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}