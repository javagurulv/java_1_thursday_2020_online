package student_julija_skopeca.practical_tasks.lesson_9.level_6;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {return fraud;}

    public String getRuleName() {return ruleName;}

    public void setRuleName(String ruleName) {this.ruleName=ruleName;}

    // реализуйте конструктор класса
    // реализуйте get() и set() методы для каждого совйства
}
