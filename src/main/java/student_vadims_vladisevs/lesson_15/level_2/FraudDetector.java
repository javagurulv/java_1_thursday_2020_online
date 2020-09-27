package student_vadims_vladisevs.lesson_15.level_2;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return compareTraderName(trader) || (compareCity(trader));
    }

    private boolean compareTraderName (Trader trader) {
        return trader.getFullName().equals("Pokemon");

    }

    private boolean compareCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }

}
