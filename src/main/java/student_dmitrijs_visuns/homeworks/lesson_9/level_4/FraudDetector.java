package student_dmitrijs_visuns.homeworks.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if ((fraudRule1(t)) ||
            (fraudRule2(t)) ||
            (fraudRule3(t)) ||
            (fraudRule4(t)) ||
            (fraudRule5(t)))
        {
            return true;
        } else return false;
    }


    private boolean fraudRule1 (Transaction t) {
        return t.getTraderFullName().equals("Pokemon");
    }

    private boolean fraudRule2 (Transaction t) {
        return t.getAmount() > 1000000;
    }

    private boolean fraudRule3 (Transaction t) {
        return t.getTraderCity().equals("Сидней");
    }

    private boolean fraudRule4 (Transaction t) {
        return t.getTraderCountry().equals("Ямайка");
    }

    private boolean fraudRule5 (Transaction t) {
        return (t.getTraderCountry().equals("Германия")
                && t.getAmount() > 1000);
    }


}
