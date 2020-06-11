package student_diana_miranovica.lesson3.homeworks.day_6.task_27;

 class BankAccount {
     private String owner;
     private final int money;

     public BankAccount(String owner, int money) {
         this.owner = owner;
         this.money = money;
     }

     public String getOwner() {
         return this.owner;
     }

     public  String getMoney() {
         return Integer.toString(money);
     }

 }
class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }


}