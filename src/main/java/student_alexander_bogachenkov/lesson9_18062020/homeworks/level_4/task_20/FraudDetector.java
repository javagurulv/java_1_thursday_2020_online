package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_20;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction.getTraderFullName().equals("Pokemon")) {
            return true;
        } else if (transaction.getAmount() > 1000000) {
            return true;
        } else if (transaction.getTraderCity().equals("Sydney")) {
            return true;
        } else if (transaction.getTraderCountry().equals("Jamaica")) {
            return true;
        } else {
            return false;
        }
    }

}