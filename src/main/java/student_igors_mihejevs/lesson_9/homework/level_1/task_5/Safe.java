package student_igors_mihejevs.lesson_9.homework.level_1.task_5;

public class Safe {

    String password;
    double money;

    public Safe(String password, double money) {
        this.password = password;
        this.money = money;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAllMoney(String password) {
        if (password.equals(this.password)) {
            double returnedMoney = this.money;
            this.money = 0;
            return returnedMoney;
        }
        else {
            System.out.println("Incorrect password");
            return 0;
        }
    }

    public double getMoney(String password, double money) {
        if (password.equals(this.password)) {
            if (this.money - money >= 0) {
                this.money = this.money - money;
                return money;
            } else {
                System.out.println("Incorrect amount of money");
                return 0;
            }
        }
        else {
            System.out.println("Incorrect password");
            return 0;
        }
    }

    public void putMoney(String password, double money) {
        if (password.equals(this.password)) this.money = this.money + money;
        else System.out.println("Incorrect password");
    }

}
