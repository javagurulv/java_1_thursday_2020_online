package student_aleksey_kodin.lesson9.level5.task_22;

import student_aleksey_kodin.lesson9.level5.task_22.fraudlogic.BanTraderAmounts;
import student_aleksey_kodin.lesson9.level5.task_22.fraudlogic.BanTraderCity;
import student_aleksey_kodin.lesson9.level5.task_22.fraudlogic.BanTraderCountry;
import student_aleksey_kodin.lesson9.level5.task_22.fraudlogic.BanTraderNames;

public class Trader {

    private final String fullName;
    private final String country;
    private final String city;

    public Trader(String fullName, String city, String country) {
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

class FraudDetector {
    BanTraderNames banTraderNames = new BanTraderNames();
    BanTraderAmounts banTraderAmounts = new BanTraderAmounts();
    BanTraderCity banTraderCity = new BanTraderCity();
    BanTraderCountry banTraderCountry = new BanTraderCountry();

    boolean isFraud(Transaction t) {
        boolean result;


        result = banTraderNames.checkBanNames(t); // true
        result = banTraderAmounts.checkBanAmounts(t);  // true
        result = banTraderCity.checkBanCity(t);  // true
        result = banTraderCountry.checkBanCountry(t); // result true

        if ((banTraderCountry.checkBanCountry(t)) && (banTraderAmounts.checkBanAmounts(t))) {
            System.out.println("Transaction from " + t.getTrader().getCountry() + " and sum more " +
                    t.getAmount() + " canceled");
        }
        return result;
    }
}

class Demo {
    public static void main(String[] args) {
        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Operation(s) completed");
        }
    }
}
