package student_aleksey_kodin.lesson9.level6.task_30;

abstract class FraudRule {

    private final String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;

    }

    public abstract boolean isFraud(Transaction t);

}
