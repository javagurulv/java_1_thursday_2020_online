package student_julija_skopeca.practical_tasks.lesson_9.level_5;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.TraderOkTest();
        test.Rule1Test();
        test.Rule2Test();
        test.Rule3Test();
        test.Rule4Test();
        test.Rule5Test();
        test.Rule3andRule5Test();
    }

    public void TraderOkTest() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("TraderOkTest - FAIL");
        } else {
            System.out.println("TraderOkTest - OK");
        }
    }

    public void Rule1Test() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Rule1Test - OK");
        } else {
            System.out.println("Rule1Test - FAIL");
        }
    }

    public void Rule2Test() {
        Trader trader = new Trader("Trader", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Rule2Test - OK");
        } else {
            System.out.println("Rule2Test - FAIL");
        }
    }

    public void Rule3Test() {
        Trader trader = new Trader("Trader", "Sydney", "Latvia");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Rule3Test - OK");
        } else {
            System.out.println("Rule3Test - FAIL");
        }
    }

    public void Rule4Test() {
        Trader trader = new Trader("Trader", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 10);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Rule4Test - OK");
        } else {
            System.out.println("Rule4Test - FAIL");
        }
    }

    public void Rule5Test() {
        Trader trader = new Trader("Trader", "Riga", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Rule5Test - OK");
        } else {
            System.out.println("Rule5Test - FAIL");
        }
    }

    public void Rule3andRule5Test() {
        Trader trader = new Trader("Trader", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule[] fraudRules = new FraudRule[5];
        fraudRules[0] = new FraudRule1("Rule1");
        fraudRules[1] = new FraudRule2("Rule2");
        fraudRules[2] = new FraudRule3("Rule3");
        fraudRules[3] = new FraudRule4("Rule4");
        fraudRules[4] = new FraudRule5("Rule5");
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Rule3andRule5Test - OK");
        } else {
            System.out.println("Rule3andRule5Test - FAIL");
        }
    }

}