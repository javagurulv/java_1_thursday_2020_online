package student_aleksey_kodin.lesson7.day6.task11;

class CreditCardTest {
    private static final CreditCard creditCard = new CreditCard("457896321","4315");

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCard.setCardCreditLimit(100);

        creditCardTest.testDepositWrongPin(100);
        creditCardTest.testDeposit(100);
        creditCardTest.testWithdrawWrongPin(50);
        creditCardTest.testWithdraw(50);
        creditCardTest.testWithdrawWithCreditLimit(150);
        creditCardTest.testWithdrawMoreThanCreditLimit(150);
        creditCardTest.testDepositThanHaveLoanDebt(100);
        creditCardTest.testDeposit(100);

    }
    public void testDepositWrongPin(int sum) {
        boolean result = creditCard.deposit(sum,"4316");
        printTestResult(!result, "test Deposit Wrong Pin");
    }
    public void testDeposit(int sum) {
        creditCard.deposit(sum,"4315");
        printTestResult(creditCard.getCardBalance() == 100, "test Deposit");
    }
    public void testWithdrawWrongPin(int sum) {
        boolean result = creditCard.withdraw(sum,"4316");
        printTestResult(!result, "test Withdraw Wrong Pin");
    }
    // На карте сейчас 100
    public void testWithdraw(int sum) {
        creditCard.withdraw(sum,"4315");
        printTestResult(creditCard.getCardBalance() == 50, "test Withdraw");
    }
    // На карте сейчас 50, кредит лимит - 100, снимаем - 150. На карте - 0, задолжность - 100
    public void testWithdrawWithCreditLimit(int sum) {
        creditCard.withdraw(sum,"4315");
        printTestResult(((creditCard.getCardBalance() == 0) && (creditCard.getCardLoanDebt()) == 100),"test Withdraw With Credit Limit");
    }
    public void testWithdrawMoreThanCreditLimit(int sum) {
        boolean result = creditCard.withdraw(sum,"4315");
        printTestResult(!result,"test Withdraw More Than Credit Limit");
    }
    public void testDepositThanHaveLoanDebt(int sum) {
        creditCard.deposit(sum,"4315");
        printTestResult(((creditCard.getCardBalance() == 0) && (creditCard.getCardLoanDebt()) == 0),"test Deposit Than Have Loan Debt");
    }
    private void printTestResult(boolean isResultOk,String returnReport) {
        if (isResultOk) {
            System.out.println("Credit Card test - " + returnReport + " = OK");
        } else {
            System.out.println("Credit Card test - " + returnReport + " = FAIL");
        }
    }
}
