package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

public class BanTraderNames {

    public boolean checkBanNames(Transaction transaction) {
        boolean result = false;
        for (FraudNames fraudNames : FraudNames.values()) {
            if (transaction.getTrader().getFullName().equals(fraudNames.name())) {
                banTraderTransaction(transaction);
                result = true;
                break;
            }
        }
        return result;
    }

    private void banTraderTransaction(Transaction transaction) {
        System.out.println("Transaction from " + transaction.getTrader().getFullName() + " canceled");
    }
}
