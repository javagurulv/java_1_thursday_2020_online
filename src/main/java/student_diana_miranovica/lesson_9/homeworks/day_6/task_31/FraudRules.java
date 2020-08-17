package student_diana_miranovica.lesson_9.homeworks.day_6.task_31;

abstract class FraudRules {

    private String ruleName;

    public FraudRules (String ruleName){
        this.ruleName = ruleName;
    }
    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}
