package student_vadims_vladisevs.lesson_x.bank_account;

class TransactionTypeDemo {


     TransactionType deposit = TransactionType.DEPOSIT;
     TransactionType withdrawal = TransactionType.WITHDRAWAL;
     TransactionType transactionType = TransactionType.WITHDRAWAL;

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void detectTransactionType(TransactionType transactionType){

        if (transactionType.equals(TransactionType.WITHDRAWAL)) {
            System.out.println("This transaction is withdrawal transaction!");
        }

        if (transactionType.equals(TransactionType.DEPOSIT)) {
            System.out.println("This transaction is deposit transaction!");
        }
    }
}
