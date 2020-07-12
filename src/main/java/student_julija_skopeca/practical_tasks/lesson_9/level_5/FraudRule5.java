package student_julija_skopeca.practical_tasks.lesson_9.level_5;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if ((t.getTarderState().equals("Germany")) && (t.getTardeAmount()>1000)) {
            return true;}
        else {
            return false;
        }
    }

}