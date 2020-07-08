package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

public class BanTraderCity {

    public boolean checkBanCity(Transaction transaction) {
        boolean result = false;
        for (FraudCity fraudAmount : FraudCity.values()) {
            if (transaction.getTrader().getCity().equals(fraudAmount.name())) {
                banCityTransaction(transaction);
                result = true;
                break;
            }
        }
        return result;
    }
    private void banCityTransaction(Transaction transaction) {
        System.out.println("Transaction from " + transaction.getTrader().getCity() + " canceled");
    }
}
