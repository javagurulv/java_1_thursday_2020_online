package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

public class BanTraderAmounts {

    public boolean checkBanAmounts(Transaction transaction) {
        boolean result = false;
        for (FraudAmount fraudAmount : FraudAmount.values()) {
            if (transaction.getAmount() > fraudAmount.getValue()) {
                banAmountTransaction(transaction);
                result = true;
                break;
            }
        }
        return result;
    }

    private void banAmountTransaction(Transaction transaction) {
        System.out.println("Transaction sum " + transaction.getAmount() + " canceled");
    }
}
