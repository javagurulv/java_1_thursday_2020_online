package student_aleksey_kodin.lessonx.bank_account.part_3_inheritance_refactoring;

class TransactionDemo {
    Transaction deposit = TransactionFactory.createDepositTransaction("User", 10);
    Transaction deposit_2 = TransactionFactory.createWithdrawalTransaction("User", 10,
            ExpenseCategory.ENTERTAINMENT);

}
