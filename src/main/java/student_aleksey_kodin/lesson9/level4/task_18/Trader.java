package student_aleksey_kodin.lesson9.level4.task_18;

class Trader {

    private final String fullName;
    private final String city;

    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
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
        if (t.getTrader().getFullName().contains("Pokemon")) {
            banTraderTransaction(t);
            return true;
        }
        if (t.getAmount() > 1000000) {
            banAmountTransaction(t);
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
}

class Demo {
    public static void main(String[] args) {
        Trader trader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(trader, 5000000);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Operation completed");
        }
    }
}
