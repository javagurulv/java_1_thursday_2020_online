package student_aleksey_kodin.lessonx.bank_account.part_2_expense_analyser.task_24;

class TransactionDemo {
    Transaction deposit = TransactionFactory.createDepositTransaction("User", 10);
    Transaction deposit_2 = TransactionFactory.createWithdrawalTransaction("User", 10,
            ExpenseCategory.ENTERTAINMENT);

}
