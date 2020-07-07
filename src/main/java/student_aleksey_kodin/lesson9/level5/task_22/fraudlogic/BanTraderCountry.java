package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

public class BanTraderCountry {

    public boolean checkBanCountry(Transaction transaction) {
        boolean result = false;
        for (FraudCountry fraudCountry : FraudCountry.values()) {
            if (transaction.getTrader().getCountry().equals(fraudCountry.name())) {
                banCountryTransaction(transaction);
                result = true;
                break;
            }
        }
        return result;
    }

    private void banCountryTransaction(Transaction transaction) {
        System.out.println("Transaction from " + transaction.getTrader().getCountry() + " canceled");
    }
}
