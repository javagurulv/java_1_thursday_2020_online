package student_vadims_vladisevs.lesson9.day_6;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules){
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {

        for (FraudRule fraudRule : fraudRules){
            if (fraudRule.isFraud(t)){
                String ruleName = fraudRule.getRuleName();
                System.out.println(t.toString());
                return new FraudDetectionResult(true, ruleName);

                // почему тут нет return?
				// нашли первое правило по fraud и можно сразу возвращать результат
				// иначе получается, что мы продолжаем поиск и вернём последнее сработавшее правило
            }
        }

        return new FraudDetectionResult(false, null);
    }

}