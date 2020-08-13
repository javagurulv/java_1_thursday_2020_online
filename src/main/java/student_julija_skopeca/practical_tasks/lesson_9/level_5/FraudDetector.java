package student_julija_skopeca.practical_tasks.lesson_9.level_5;

public class FraudDetector {

    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        boolean result = false;
        for(FraudRule fraudRule: fraudRules){
            if (fraudRule.isFraud(t)) {
                result = true;
            }
        }
        return result;
    }

}
