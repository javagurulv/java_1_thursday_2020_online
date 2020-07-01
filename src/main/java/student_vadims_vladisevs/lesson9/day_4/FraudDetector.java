package student_vadims_vladisevs.lesson9.day_4;

class FraudDetector {

    boolean isFraud(Transaction t) {

        if (checkTraderName(t)){
            return true;
        }
        if (checkTransactionAmount(t)){
            return true;
        }
        if (checkTraderCity(t)){
            return true;
        }
        if (checkTraderCountry(t)){
            return true;
        }
        if (checkTraderCountryAndAmount(t)){
            return true;
        }
        return false;
    }

    private boolean checkTraderCountryAndAmount(Transaction t){
        return traderCountry(t).equals("Germany") && transactionAmount(t) > 1000;
    }

    private boolean checkTraderCountry(Transaction t){
        return traderCountry(t).equals("Jamaica");
    }

    private boolean checkTraderCity(Transaction t){
        return traderCity(t).equals("Sidney");
    }

    private boolean checkTransactionAmount(Transaction t){
        return transactionAmount(t) > 1000000;
    }

    private boolean checkTraderName(Transaction t){
        return traderFullName(t).equals("Pokemon");
    }

    private String traderFullName(Transaction t){
        return t.getTrader().getFullName();
    }

    private int transactionAmount(Transaction t){
        return t.getAmount();
    }

    private String traderCity(Transaction t){
        return t.getTrader().getCity();
    }

    private String traderCountry(Transaction t){
        return t.getTrader().getCountry();
    }

}