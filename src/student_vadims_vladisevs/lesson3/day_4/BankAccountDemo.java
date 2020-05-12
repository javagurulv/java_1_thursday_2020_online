package student_vadims_vladisevs.lesson3.day_4;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();             //вместо "ownerFirstName", нужно "ownerLastName";
        int moneyAmount = bankAccount.getMoneyAmount();                    //вметсо "String", нужно "int";
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}

