package student_aleksey_kodin.lessonx.bank_account.part_1_basic.task_14;

public class TransactionTypeDemo {
    TransactionType deposit = TransactionType.DEPOSIT;
    TransactionType withdrawal = TransactionType.WITHDRAWAL;
    TransactionType transactionType = TransactionType.WITHDRAWAL;

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void equalTransactionType(TransactionType transactionType) {
        if (transactionType == TransactionType.WITHDRAWAL) {
            System.out.println("This transaction is withdrawal transaction!");
        }
        if (transactionType == TransactionType.DEPOSIT) {
            System.out.println("This transaction is deposit transaction!");
        }
    }
}
