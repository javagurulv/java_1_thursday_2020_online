package student_igors_mihejevs.lesson_9.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule5 extends FraudRule {
    // The city is Germany and amount of transaction is more than 1000

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Germany")) && (t.getAmount() > 1000);
    }

}
