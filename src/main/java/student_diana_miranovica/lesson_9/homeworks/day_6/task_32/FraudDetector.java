package student_diana_miranovica.lesson_9.homeworks.day_6.task_32;


class FraudDetector {

    private FraudRules[] fraudRules;
    public FraudDetector (FraudRules[] fraudRules){
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction){
        FraudDetectionResult[] fraudDetectionResults;
        for (FraudRules fraudRules : fraudRules) {
            if (fraudRules.isFraud(transaction)) {
                return new FraudDetectionResult(true, fraudRules.getRuleName());
            }
        }
        return new FraudDetectionResult(true,null);
    }
}
