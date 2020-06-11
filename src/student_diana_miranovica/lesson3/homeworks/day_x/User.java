package student_diana_miranovica.lesson3.homeworks.day_x;

public class User {

    private static String username;
    private static String password;
    private boolean isUserBlocked;
    private int countOfAttempts;

    User(String username,String password){
        this.username = username;
        this.password = password;
        isUserBlocked = false;
        countOfAttempts = 3;
    }

    public void setUserLogin(String userLogin) {
        this.username = userLogin;
    }
    public int getCountOfAttempts(int countOfAttempts){
        return countOfAttempts;
    }

    public void setCountOfAttempts(int attempts) {
        this.countOfAttempts = this.countOfAttempts - attempts;
    }

    public void isUserBlocked(boolean isUserBlocked) {
        this.isUserBlocked = isUserBlocked;
    }
    public String getPassword(String password) {
        return password;
    }

    public boolean isUserBlocked() {
        return isUserBlocked;
    }
    public void blockUser(){
        this.isUserBlocked = true;
    }

}
