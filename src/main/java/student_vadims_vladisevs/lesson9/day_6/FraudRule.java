package student_vadims_vladisevs.lesson9.day_6;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName){
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}