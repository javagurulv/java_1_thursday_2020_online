package student_igors_mihejevs.lesson_9.level_4;

class FraudDetector {

    boolean isFraudPokemon(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    boolean isFraudBigAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    boolean isFraudSidney(Transaction t) {
        return t.getTrader().getCity().equals("Sidney");
    }

}
