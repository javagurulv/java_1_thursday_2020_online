package student_julija_skopeca.practical_tasks.lesson_9.level_5;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTarderState().equals("Jamaica")) {
            return true;}
        else {
            return false;
        }
    }

}
