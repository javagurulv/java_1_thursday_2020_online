package student_vadims_vladisevs.lesson9.day_6;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }
}
