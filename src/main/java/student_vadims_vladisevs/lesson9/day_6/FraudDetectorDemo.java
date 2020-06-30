package student_vadims_vladisevs.lesson9.day_6;

import java.util.ArrayList;

class FraudDetectorDemo {
    public static void main(String[] args) {

        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        FraudRule1 fraudRule1 = new FraudRule1("Check Name");
        FraudRule2 fraudRule2 = new FraudRule2("Check Transaction Amount");
        FraudRule3 fraudRule3 = new FraudRule3("Check City");
        FraudRule4 fraudRule4 = new FraudRule4("Check Country");
        FraudRule5 fraudRule5 = new FraudRule5("Check Country And Amount");
        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        Trader trader = new Trader("Pokemon","Latvia", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        Trader trader2 = new Trader("Vadim","Latvia", "Riga");
        Transaction transaction2 = new Transaction(trader2, 1000);


        FraudDetectionResult fraudDetectionResult2 = fraudDetector.isFraud(transaction2);
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);
    }
}
