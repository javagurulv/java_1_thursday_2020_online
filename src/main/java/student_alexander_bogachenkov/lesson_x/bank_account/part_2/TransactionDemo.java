package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class TransactionDemo {

    public static void main(String[] args) {
        Transaction withdrawal = TransactionFactory.createWithdrawalTransaction(100, ExpenseCategory.ENTERTAINMENT);
        Transaction depositWithoutExpenseCategory = TransactionFactory.createDepositTransaction(100);
    }

}