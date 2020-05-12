package student_diana_miranovica.lesson3.homeworks.day_x;

public class User {
    private String userLogin;
    private String password;
    private boolean isUserBlocked;
    private byte countAttempt;

    public User(String userLogin, String password){
        this.password = password;
        this.userLogin = userLogin;
        isUserBlocked = true;
        countAttempt = 3;
    }

    public String getPassword() {
        return password;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public byte getCountAttempt() {
        return countAttempt;
    }

    public boolean isUserBlocked() {
        return isUserBlocked;
    }
    void resetCountAttempt(){
        isUserBlocked = true;
        countAttempt = 3;
    }
    void setUserBlocked(){
        isUserBlocked = false;
        countAttempt = 0;
        System.out.println("Your account is BLOCKED!");
    }
}
