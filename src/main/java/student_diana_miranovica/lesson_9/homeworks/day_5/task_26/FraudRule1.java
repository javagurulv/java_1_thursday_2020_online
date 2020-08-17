package student_diana_miranovica.lesson_9.homeworks.day_5.task_26;

class FraudRule1 extends FraudRules {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }


    public boolean isFraud(Transaction t) {
            return t.getFullNameFromTrader().equals("Pokemon");
    }

}
