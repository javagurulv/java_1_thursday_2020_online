package student_igors_mihejevs.lesson_3.homework.level_x.super_task_1;

class UserLoginServiceDemo {

    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();

        User userOne = new User("user-login", "user-password");
        System.out.println("User Login = " + userOne.getLoginName() + "\nUser Password = " + userOne.getPassword()
                           + "\nNumber of attempts = " + userOne.getNumberOfAttempts());

        if(!userOne.getIsBlocked()) {
            if(!service.login(userOne, "user-password-12345")) {
                System.out.println("Password 'user-password-12345' is not correct"); //Should return false
            }
            if(service.login(userOne, "user-password")) {
                System.out.println("Password 'user-password' is correct"); //Should return true
            }
        } else {
            System.out.println("You are blocked. Waiting for unblocking.");
        }
    }

}
