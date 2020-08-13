package student_diana_miranovica.lesson_9.homeworks.day_5.task_29;

class FraudRule4 extends FraudRules {

    public FraudRule4(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderCountry().equals("Jamaica");
    }
}
