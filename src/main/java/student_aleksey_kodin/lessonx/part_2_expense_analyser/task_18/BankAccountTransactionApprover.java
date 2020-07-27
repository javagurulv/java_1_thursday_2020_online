package student_aleksey_kodin.lessonx.part_2_expense_analyser.task_18;

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
        int creditLimit = bankAccount.getCreditLimit();
        return newTransaction.getAmount() <= currentBalance + creditLimit;
    }
}
