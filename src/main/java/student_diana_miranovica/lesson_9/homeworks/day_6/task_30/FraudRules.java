package student_diana_miranovica.lesson_9.homeworks.day_6.task_30;

abstract class FraudRules {

    private String ruleName;

    public FraudRules (String ruleName){
        this.ruleName = ruleName;
    }
    public abstract boolean isFraud(Transaction t);


}
