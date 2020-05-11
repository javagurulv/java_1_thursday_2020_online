package student_julija_skopeca.practical_tasks.lesson_3.day_4.task_17;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,
                       int money) {
        this.firstName = ownerFirstName;
        this.lastName = ownerLastName;
        this.moneyAmount = money;
    }

    public String getOwnerFirstName() {
        return this.firstName;
    }

    public String getOwnerLastName() {
        return this.lastName;
    }

    public int getMoney() {
        return this.moneyAmount;
    }
}
