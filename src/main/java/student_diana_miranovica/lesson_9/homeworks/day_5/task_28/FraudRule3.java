package student_diana_miranovica.lesson_9.homeworks.day_5.task_28;

public class FraudRule3 extends FraudRules {

    public FraudRule3(String ruleName){
        super(ruleName);
    }
    public boolean isFraud(Transaction t) {
        return t.getAmount()>(1000000);
    }
}
