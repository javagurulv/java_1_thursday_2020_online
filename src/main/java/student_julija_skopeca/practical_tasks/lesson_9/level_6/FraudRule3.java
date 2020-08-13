package student_julija_skopeca.practical_tasks.lesson_9.level_6;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTarderCity().equals("Sydney")) {
            return true;}
        else {
            return false;
        }
    }

}
