package student_diana_miranovica.lesson_9.homeworks.day_4.task_17;



public class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction.getFullNameFromTrader().equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }
}
