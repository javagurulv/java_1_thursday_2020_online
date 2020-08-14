package student_alexander_bogachenkov.lesson_x.bank_account.part_1;

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        int currentBalance = currentBalanceCalculator.calculate(bankAccount);
        if (newTransaction.isDeposit()) {
            return true;
        } else {
            return newTransaction.isWithdrawal() && currentBalance >= newTransaction.getAmount();
        }
    }

}
