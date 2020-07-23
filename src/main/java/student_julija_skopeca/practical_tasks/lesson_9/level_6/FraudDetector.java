package student_julija_skopeca.practical_tasks.lesson_9.level_6;

public class FraudDetector {

    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for(FraudRule fraudRule: fraudRules){
            if (fraudRule.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}
