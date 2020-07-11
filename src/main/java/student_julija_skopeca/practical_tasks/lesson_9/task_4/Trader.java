package student_julija_skopeca.practical_tasks.lesson_9.task_4;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {return fullName;}

}


class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
    public String getTraderName() {
        return trader.getFullName();
    }
    public int getTardeAmount() {return amount;}
}


class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTraderName().equals("Pokemon")) {
            return true;
        } else if(t.getTardeAmount()>1000000){
            return true;
        } else {
            return false;
        }

    }
}

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.isFraudbyNameTest();
        test.isFraudbyTradeAmountTest();
        test.isFraudbyNameTestandTradeAmountTest();
        test.tarderNameandTradeAmountIsOKTest();

    }
        public void isFraudbyNameTest() {
            Trader trader = new Trader("Pokemon", "Riga");
            Transaction transaction = new Transaction(trader, 10);
            FraudDetector fraudDetector = new FraudDetector();
            if (fraudDetector.isFraud(transaction)) {
                System.out.println("isFraudbyNameTest - OK");
            } else {
                System.out.println("isFraudbyNameTest - Fail");
            }
        }

    public void isFraudbyTradeAmountTest() {
        Trader trader = new Trader("Trader1", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyTradeAmountTest - OK");
        } else {
            System.out.println("isFraudbyTradeAmountTest - Fail");
        }
    }

    public void isFraudbyNameTestandTradeAmountTest() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyNameTestandTradeAmountTest - OK");
        } else {
            System.out.println("isFraudbyNameTestandTradeAmountTest - Fail");
        }
    }

    public void tarderNameandTradeAmountIsOKTest() {
        Trader trader = new Trader("Trader1", "Riga");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("tarderNameandTradeAmountIsOKTest - Fail");
        } else {
            System.out.println("tarderNameandTradeAmountIsOKTest - OK");
        }
    }

}
