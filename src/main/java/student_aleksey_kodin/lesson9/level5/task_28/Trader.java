package student_aleksey_kodin.lesson9.level5.task_28;

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
    boolean isFraud(Transaction t) {

        return false;
    }
}

class Demo {
    public static void main(String[] args) {
        Trader trader = new Trader("Pokemon", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 1050);
        FraudRule1 fraudRule1 = new FraudRule1("Ban Name");
        fraudRule1.isFraud(transaction);




    }
}
