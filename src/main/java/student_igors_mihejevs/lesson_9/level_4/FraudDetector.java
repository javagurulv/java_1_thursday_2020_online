package student_igors_mihejevs.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    boolean isBigAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

}
