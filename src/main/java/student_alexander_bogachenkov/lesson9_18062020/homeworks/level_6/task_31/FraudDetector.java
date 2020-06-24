package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_6.task_31;

class FraudDetector {

    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction transaction) {
        boolean result = false;
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                result = true;
            }
        }
        return result;
    }

}