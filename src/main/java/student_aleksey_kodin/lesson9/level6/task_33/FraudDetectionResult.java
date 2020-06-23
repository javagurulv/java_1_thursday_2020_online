package student_aleksey_kodin.lesson9.level6.task_33;

class FraudDetectionResult {
    private final boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
