package student_diana_miranovica.lesson_9.homeworks.day_6.task_31;

class FraudRule2 extends FraudRules {

     public FraudRule2(String ruleName) {
         super(ruleName);
     }


     public boolean isFraud(Transaction t) {
         return t.getTraderCity().equals("Sydney");
     }
}
