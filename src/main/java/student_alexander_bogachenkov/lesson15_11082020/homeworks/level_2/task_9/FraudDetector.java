package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_2.task_9;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return isFraudByFullName(trader) || (isFraudByCity(trader));
    }

    private boolean isFraudByFullName(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean isFraudByCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}