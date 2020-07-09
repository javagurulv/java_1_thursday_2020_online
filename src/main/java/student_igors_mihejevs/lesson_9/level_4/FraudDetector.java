package student_igors_mihejevs.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {

        if (t.getTrader().getFullName().equals("Pokemon")) {
            System.out.println("For Pokemon all transactions are not allowed");
            return true;
        } else return false;
    }

}
