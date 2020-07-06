package student_dmitrijs_visuns.homeworks.lesson_9.level_6;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult (boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean getFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

}
