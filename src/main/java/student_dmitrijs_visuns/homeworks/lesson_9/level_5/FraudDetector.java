package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRulesList;

    public FraudDetector (ArrayList<FraudRule> fraudRulesList) {
        this.fraudRulesList = fraudRulesList;
    }

    boolean isFraud(Transaction t) {
        boolean result = false;
        for (FraudRule fraudRule : fraudRulesList){
            if (fraudRule.isFraud(t)){
                result = true;
            }
        }

        return result;
    }

}
