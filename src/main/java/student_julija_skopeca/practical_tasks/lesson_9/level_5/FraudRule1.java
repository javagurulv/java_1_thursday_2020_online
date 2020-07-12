package student_julija_skopeca.practical_tasks.lesson_9.level_5;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTraderName().equals("Pokemon")) {
            return true;}
        else {
            return false;
        }
    }

}
