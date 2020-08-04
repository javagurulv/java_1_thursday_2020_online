package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_12;

class BankAccountTransactionApprover {
    private final BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean approve(BankAccount bankAccount, Transaction newTransaction) {
        if (newTransaction.isDeposit()) {
            return true;
        }
        return newTransaction.getAmount() <= currentBalanceCalculator.calculate(bankAccount);
    }
}
