package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_17;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction.getTraderFullName().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }

}