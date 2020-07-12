package student_aleksey_kodin.lessonx.bank_account.task_11;

class BankAccountTransactionApprover {
    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }
}
