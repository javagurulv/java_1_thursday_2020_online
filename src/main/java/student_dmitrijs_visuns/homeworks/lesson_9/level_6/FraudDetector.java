package student_dmitrijs_visuns.homeworks.lesson_9.level_6;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRulesList;

    public FraudDetector (ArrayList<FraudRule> fraudRulesList) {
        this.fraudRulesList = fraudRulesList;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRulesList){
            if (fraudRule.isFraud(t)){
                System.out.println("Fraud detected, rule name = " + fraudRule.getRuleName());
                System.out.println(t.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());

            }
        }

        return new FraudDetectionResult (false, null);
    }

}
