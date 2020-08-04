package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_11;

class BankAccountTransactionApprover {
    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }
}
