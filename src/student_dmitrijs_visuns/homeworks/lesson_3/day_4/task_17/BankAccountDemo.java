package student_dmitrijs_visuns.homeworks.lesson_3.day_4.task_17;

import student_diana_miranovica.lesson3.homeworks.day_4.BankAccount;

public class BankAccountDemo {

    public static void main(String[] args) {
        student_diana_miranovica.lesson3.homeworks.day_4.BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
