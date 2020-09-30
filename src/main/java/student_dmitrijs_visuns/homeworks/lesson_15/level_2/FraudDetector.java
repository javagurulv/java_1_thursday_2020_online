package student_dmitrijs_visuns.homeworks.lesson_15.level_2;

class FraudDetector {

    public boolean isFraud(Trader t) {
        return (traderIsFraudByName(t, "Pokemon")
               || traderisFraudByCity(t, "Sidney"));
    }

    private boolean traderIsFraudByName (Trader t, String fraudName) {
        return t.getFullName().equals(fraudName);
    }

    private boolean traderisFraudByCity (Trader t, String fraudCity) {
        return t.getCity().equals(fraudCity);
    }

}