package student_igors_mihejevs.lesson_3.homework.level_x.super_task_1;

class UserLoginServiceTest {

    public static void main(String[] args) {
        userLoginServiceTest();
    }

    // testing login method: right/wrong passwords, cancelling number to attempts to default.

    public static void userLoginServiceTest() {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");

        System.out.println("User Login = " + userOne.getLoginName() + "\nUser Password = " + userOne.getPassword() + "\n");

        if(!service.login(userOne, "user-password-12345")) {
            System.out.println("Password 'user-password-12345' is not correct\nWrong password test - OK"); //Should return false
        }
        if(service.login(userOne, "user-password")) if (userOne.getNumberOfAttempts() == 3) {
            System.out.println("Password 'user-password' is correct\nTrue password and cancel of attempts test - OK"); //Should return true
        }
    }

}
