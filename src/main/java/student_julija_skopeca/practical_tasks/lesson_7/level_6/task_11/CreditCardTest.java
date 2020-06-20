package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_11;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.testWithdrawZeroBalanceOverCardLimit();
        test.testWithdrawIncorrectPinCOde();
        test.testWithdrawZeroBalanceLimitOkDebt();
        test.testWithdrawisBalanceLimitOknoDebt();
        test.testWithdrawisBalanceLimitOkDebt();
        test.testdepositZeroBalanceNoDebt();
        test.testdepositisBalanceNoDebt();
        test.testdepositnoBalanceisDebt();
        test.testdepositnoBalanceisDebtV2();
        test.testDepositIncorrectPinCode();
    }
    // balance = 0, overlimit = false
    public void testWithdrawZeroBalanceOverCardLimit() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.withdraw(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == 0) {
            System.out.println("testWithDrawZeroBalanceOverCardLimit - OK");
        } else {
            System.out.println("testWithDrawZeroBalanceOverCardLimit - FAIL");
        }
    }

    // balance = 0, overlimit = false
    public void testWithdrawIncorrectPinCOde() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.changeCreditCardLimit(100);
        creditCard.withdraw(2224, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == -10) {
            System.out.println("testWithdrawIncorrectPinCOde - FAIL");
        } else {
            System.out.println("testWithdrawIncorrectPinCOde - OK");
        }
    }


    //balance = 0; overlimit - ok, withdraw - 10, debt - 10
    public void testWithdrawZeroBalanceLimitOkDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.changeCreditCardLimit(100);
        creditCard.withdraw(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == -10) {
            System.out.println("testWithdrawZeroBalanceLimitOkDebt - OK");
        } else {
            System.out.println("testWithdrawZeroBalanceLimitOkDebt - FAIL");
        }
    }

    //balance = 5; overlimit - ok, withdraw - 5
    public void testWithdrawisBalanceLimitOknoDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.changeCreditCardLimit(100);
        creditCard.deposit(2222, 5);
        creditCard.withdraw(2222, 5);
        int result = creditCard.getCreditCardBalance();
        if (result == 0) {
            System.out.println("testWithdrawisBalanceLimitOknoDebt - OK");
        } else {
            System.out.println("testWithdrawisBalanceLimitOknoDebt - FAIL");
        }
    }

    //balance = 5; overlimit - ok, withdraw = 10, Debt -5
    public void testWithdrawisBalanceLimitOkDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.changeCreditCardLimit(100);
        creditCard.deposit(2222, 5);
        creditCard.withdraw(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == -5) {
            System.out.println("testWithdrawisBalanceLimitOknoDebt - OK");
        } else {
            System.out.println("testWithdrawisBalanceLimitOknoDebt - FAIL");
        }
    }

    //balance = 0; deposit = 10, Dept = 0
    public void testdepositZeroBalanceNoDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.deposit(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == 10) {
            System.out.println("testdepositZeroBalanceNoDebt - OK");
        } else {
            System.out.println("testdepositZeroBalanceNoDebt - FAIL");
        }
    }

    //balance = 5; deposit = 10, Dept = 0
    public void testdepositisBalanceNoDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.deposit(2222, 5);
        creditCard.deposit(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == 15) {
            System.out.println("testdepositisBalanceNoDebt - OK");
        } else {
            System.out.println("testdepositisBalanceNoDebt - FAIL");
        }
    }

    //balance = 0; deposit = 10, Dept = -10
    public void testdepositnoBalanceisDebt() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.changeCreditCardLimit(100);
        creditCard.withdraw(2222, 10);
        creditCard.deposit(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == 0) {
            System.out.println("testdepositnoBalanceisDebt - OK");
        } else {
            System.out.println("testdepositnoBalanceisDebt - FAIL");
        }
    }

    //balance = 0; deposit = 10, Dept = -5
    public void testdepositnoBalanceisDebtV2() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.changeCreditCardLimit(100);
        creditCard.withdraw(2222, 5);
        creditCard.deposit(2222, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == 5) {
            System.out.println("testdepositnoBalanceisDebtV2 - OK");
        } else {
            System.out.println("testdepositnoBalanceisDebtV2 - FAIL");
        }
    }

    //balance = 0; deposit = 10, Dept = 0, Icorrect pin code
    public void testDepositIncorrectPinCode() {
        CreditCard creditCard = new CreditCard();
        creditCard.createCreditCard(1234567, 2222);
        creditCard.deposit(2224, 10);
        int result = creditCard.getCreditCardBalance();
        if (result == 10) {
            System.out.println("testDepositIncorrectPinCode - FAIL");
        } else {
            System.out.println("testDepositIncorrectPinCode - OK");
        }
    }

}
