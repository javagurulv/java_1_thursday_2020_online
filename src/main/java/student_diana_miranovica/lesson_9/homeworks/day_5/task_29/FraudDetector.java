package student_diana_miranovica.lesson_9.homeworks.day_5.task_29;


class FraudDetector {

    private FraudRules[] fraudRules;
    public FraudDetector (FraudRules[] fraudRules){
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction transaction){
        boolean result = true;
        for (FraudRules fraudRules : fraudRules) {
            if (fraudRules.isFraud(transaction)) {
                result = true;
            }
        }
        return result;
    }
}
