package student_vadims_vladisevs.lesson9.day_6;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules){
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        boolean result = false;
        String ruleName = null;
        for (FraudRule fraudRule : fraudRules){
            if (fraudRule.isFraud(t)){
                result = true;
                ruleName = fraudRule.getRuleName();
                System.out.println(t.toString());
            }
        }

        return new FraudDetectionResult(result, ruleName);
    }

}