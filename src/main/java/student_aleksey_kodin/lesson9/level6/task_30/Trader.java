package student_aleksey_kodin.lesson9.level6.task_30;

import java.util.ArrayList;
import java.util.List;

class Trader {

    private final String fullName;
    private final String country;
    private final String city;

    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}

class Transaction {

    private final Trader trader;
    private final int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}

class FraudDetector {
    List<FraudRule> fraudRules;

    FraudDetector(List<FraudRule> fraudRule) {
        fraudRules = fraudRule;
    }
    boolean isFraud(Transaction t) {
        boolean result = false;
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                result = true;
            }
        }
        return result;
    }
}

class Demo {
    public static void main(String[] args) {
        List<FraudRule> fraudRules = new ArrayList<>();

        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1050);

        FraudRule1 fraudRule1 = new FraudRule1("Ban Name");
        FraudRule2 fraudRule2 = new FraudRule2("Ban amount more 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Ban Сидней");
        FraudRule4 fraudRule4 = new FraudRule4("Ban Ямайка");
        FraudRule5 fraudRule5 = new FraudRule5("Ban Германия & amount more 1000");

        fraudRules.add(fraudRule1);
        fraudRules.add(fraudRule2);
        fraudRules.add(fraudRule3);
        fraudRules.add(fraudRule4);
        fraudRules.add(fraudRule5);

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(transaction);
        if (result) {
            System.out.println("Operation(s) completed");
        }
    }
}
