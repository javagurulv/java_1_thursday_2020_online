package student_aleksey_kodin.lessonx.part_1_basic.task_11;

class BankAccountTransactionApprover {
    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    public BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }
}
