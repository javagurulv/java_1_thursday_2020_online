package student_dmitrijs_visuns.homeworks.lesson_9.level_5;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTraderFullName().toLowerCase().equals("pokemon");
    }

}