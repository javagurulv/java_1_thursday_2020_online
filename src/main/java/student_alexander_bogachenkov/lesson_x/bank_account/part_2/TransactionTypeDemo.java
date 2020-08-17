package student_alexander_bogachenkov.lesson_x.bank_account.part_2;

class TransactionTypeDemo {

    public static void main(String[] args) {
        TransactionType deposit = TransactionType.DEPOSIT;
        TransactionType withdrawal = TransactionType.WITHDRAWAL;
        TransactionType transactionType = TransactionType.WITHDRAWAL;

        transactionType = TransactionType.DEPOSIT;

        transactionType = TransactionType.WITHDRAWAL;
        if (transactionType == TransactionType.WITHDRAWAL) {
            System.out.println("This transaction is withdrawal transaction!");
        }
        transactionType = TransactionType.DEPOSIT;
        if (transactionType == TransactionType.DEPOSIT) {
            System.out.println("This transaction is deposit transaction!");
        }
    }

}
