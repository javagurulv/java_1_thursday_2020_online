package student_aleksey_kodin.lessonx.bank_account.part_2_expense_analyser.task_19;

class TransactionDemo {
    Transaction transaction_1 = new Transaction("User",1000,TransactionType.WITHDRAWAL,ExpenseCategory.FOOD);
    Transaction transaction_2 = new Transaction("User",1000,TransactionType.DEPOSIT,null);
    Transaction transaction_3 = new Transaction("User",1000,TransactionType.DEPOSIT,ExpenseCategory.GAMBLING);

}
