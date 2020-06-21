package student_aleksey_kodin.lesson9.level4.task_20;

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

    public String getCountry() { return country; }
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
    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().contains("Pokemon")) {
            banTraderTransaction(t);
            return true;
        }
        if (t.getAmount() > 1000000) {
            banAmountTransaction(t);
            return true;
        }
        if (t.getTrader().getCity().contains("Сидней")) {
            banCityTransaction(t);
            return true;
        }
        if (t.getTrader().getCountry().contains("Ямайка")) {
            banCountryTransaction(t);
            return true;
        }
        return false;
    }

    private void banTraderTransaction(Transaction transaction) {
        System.out.println("Transaction from " + transaction.getTrader().getFullName() + " canceled");
    }

    private void banAmountTransaction(Transaction transaction) {
        System.out.println("Transaction sum " + transaction.getAmount() + " canceled");
    }

    private void banCityTransaction(Transaction transaction) {
        System.out.println("Transaction from " + transaction.getTrader().getCity() + " canceled");
    }
    private void banCountryTransaction(Transaction transaction) {
        System.out.println("Transaction from " + transaction.getTrader().getCountry() + " canceled");
    }
}

class Demo {
    public static void main(String[] args) {
        Trader trader = new Trader("AnyMane", "London","Ямайка");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Operation completed");
        }
    }
}
