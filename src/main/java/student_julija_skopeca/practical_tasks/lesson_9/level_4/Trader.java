package student_julija_skopeca.practical_tasks.lesson_9.level_4;

class Trader {

    private String fullName;
    private String city;
    private String state;

    public Trader(String fullName, String city, String state) {
        this.fullName = fullName;
        this.city = city;
        this.state = state;
    }

    public String getFullName() {return fullName;}
    public String getCity() {return city;}
    public String getState() {return state;}

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
    public String getTarderCity() {return trader.getCity();}
    public String getTarderState() {return trader.getState();}
}


class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTraderName().equals("Pokemon")) {
            return true;
        } else if(t.getTardeAmount()>1000000){
            return true;
        } else if(t.getTarderCity().equals("Sydney")){
            return true;
        } else if(t.getTarderState().equals("Jamaica")){
            return true;
        } else if((t.getTarderState().equals("Germany")) && (t.getTardeAmount()>1000)){
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
        test.isFraudbyCityTest();
        test.isFraudbyStateTest();
        test.isFraudbyStateGermanyAndAmountTest();
        test.stateGermanyAndAmountTestisOkTest();
        test.stateOKAndAmountTest();

    }
        public void isFraudbyNameTest() {
            Trader trader = new Trader("Pokemon", "Riga", "Latvia");
            Transaction transaction = new Transaction(trader, 10);
            FraudDetector fraudDetector = new FraudDetector();
            if (fraudDetector.isFraud(transaction)) {
                System.out.println("isFraudbyNameTest - OK");
            } else {
                System.out.println("isFraudbyNameTest - Fail");
            }
        }

    public void isFraudbyTradeAmountTest() {
        Trader trader = new Trader("Trader1", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyTradeAmountTest - OK");
        } else {
            System.out.println("isFraudbyTradeAmountTest - Fail");
        }
    }

    public void isFraudbyNameTestandTradeAmountTest() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyNameTestandTradeAmountTest - OK");
        } else {
            System.out.println("isFraudbyNameTestandTradeAmountTest - Fail");
        }
    }

    public void tarderNameandTradeAmountIsOKTest() {
        Trader trader = new Trader("Trader1", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("tarderNameandTradeAmountIsOKTest - Fail");
        } else {
            System.out.println("tarderNameandTradeAmountIsOKTest - OK");
        }
    }

    public void isFraudbyCityTest() {
        Trader trader = new Trader("Trader1", "Sydney", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyCityTest - OK");
        } else {
            System.out.println("isFraudbyCityTest - Fail");
        }
    }

    public void isFraudbyStateTest() {
        Trader trader = new Trader("Trader1", "Riga", "Jamaica" );
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyStateTest - OK");
        } else {
            System.out.println("isFraudbyStateTest - Fail");
        }
    }

    public void isFraudbyStateGermanyAndAmountTest() {
        Trader trader = new Trader("Trader1", "Riga", "Germany" );
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("isFraudbyStateGermanyAndAmoutTest - OK");
        } else {
            System.out.println("isFraudbyStateGermanyAndAmoutTest - Fail");
        }
    }

    public void stateGermanyAndAmountTestisOkTest() {
        Trader trader = new Trader("Trader1", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("stateGermanyAndAmountTestisOkTest - Fail");
        } else {
            System.out.println("stateGermanyAndAmountTestisOkTest - OK");
        }
    }

    public void stateOKAndAmountTest() {
        Trader trader = new Trader("Trader1", "Riga", "Latvia" );
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("stateOKAndAmountTest - fail");
        } else {
            System.out.println("stateOKAndAmountTest - OK");
        }
    }

}
