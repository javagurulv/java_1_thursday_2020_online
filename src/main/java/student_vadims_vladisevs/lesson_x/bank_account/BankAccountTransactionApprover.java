package student_vadims_vladisevs.lesson_x.bank_account;

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator bankAccountCurrentBalanceCalculator){
        this.currentBalanceCalculator = bankAccountCurrentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        int currentBalance = currentBalanceCalculator.calculate(bankAccount);
        int creditLimit = bankAccount.getCreditLimit();
        return newTransaction.isDeposit()
                || newTransaction.isWithdrawal() && currentBalance + creditLimit >= newTransaction.getAmount();
    }
}
