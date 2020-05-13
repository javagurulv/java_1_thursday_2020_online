package student_vladimir_filipov.lesson3_hometasks.day_4;

class BankAccountDemo {

        public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Vladimir", "Filipov", 150000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int summ = bankAccount.getMoneyAmount();

        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " +  summ);
    }

}

