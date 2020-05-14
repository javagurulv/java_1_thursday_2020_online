package student_vadims_vladisevs.lesson3.day_x.super_task_1;

class User {

    private String userLogin;
    private String userPassword;
    private boolean isUserBlocked;
    private int loginAttemptsCount;

    public User(String userLogin, String userPassword){
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.isUserBlocked = false;
        this.loginAttemptsCount = 3;
    }

    public void setLoginAttemptsCount(int count){
        this.loginAttemptsCount = count;
    }

    public int getLoginAttemptsCount(){
        return loginAttemptsCount;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public void setUserBlocked(){
        isUserBlocked = true;
    }

    public void resetAttemptsCount(){
        loginAttemptsCount = 3;
    }

    public boolean getIsUserBlocked(){
        return isUserBlocked;
    }


    public void printUserInfo(){
        System.out.println("User login: " + userLogin);
        System.out.println("User password: " + userPassword);
        System.out.println("User status(is user blocked): " + isUserBlocked);
        System.out.println("Login attempts count: " + loginAttemptsCount);
    }
}

