package student_julija_skopeca.practical_tasks.lesson_9.level_6;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTardeAmount()>1000000) {
            return true;}
        else {
            return false;
        }
    }

}
