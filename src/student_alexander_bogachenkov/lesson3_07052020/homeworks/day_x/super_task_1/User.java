package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_x.super_task_1;

class User {

    private String username;
    private String password;
    private boolean IsBlocked;
    private int amountOfLoginAttempts;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getAmountOfLoginAttempts() {
        return amountOfLoginAttempts;
    }

    public void setAmountOfLoginAttempts(int attempts) {
        this.amountOfLoginAttempts = this.amountOfLoginAttempts - attempts;
    }

    public boolean IsBlocked() {
        return IsBlocked;
    }

    public void resetAmountOfLoginAttempts() {
        this.amountOfLoginAttempts = 0;
    }

    public void blockUser() {
        this.IsBlocked = true;
    }
}
