package student_vadims_vladisevs.lesson9.day_5;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules){
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        boolean result = false;
        for (FraudRule fraudRule : fraudRules){
            if (fraudRule.isFraud(t)){
                result = true;
            }
        }

        return result;
    }

}