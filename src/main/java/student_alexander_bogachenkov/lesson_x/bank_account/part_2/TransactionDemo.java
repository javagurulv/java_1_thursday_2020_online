package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class TransactionDemo {

    public static void main(String[] args) {
        Transaction withdrawal = new Transaction(100, TransactionType.WITHDRAWAL, ExpenseCategory.ENTERTAINMENT);
        Transaction depositWithoutExpenseCategory = new Transaction(100, TransactionType.DEPOSIT, null);
        Transaction depositWithExpenseCategory = new Transaction(100, TransactionType.DEPOSIT, ExpenseCategory.FOOD);
    }

}