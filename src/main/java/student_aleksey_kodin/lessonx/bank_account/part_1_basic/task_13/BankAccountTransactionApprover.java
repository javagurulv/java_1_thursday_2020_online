package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_13;

class BankAccountTransactionApprover {
    private final BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        if (newTransaction.isDeposit()) {
            return true;
        }
        int currentBalance = currentBalanceCalculator.calculate(bankAccount);
        return newTransaction.getAmount() <= currentBalance;
    }
}
