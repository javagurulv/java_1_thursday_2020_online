package student_aleksey_kodin.lesson3.dayx.supertask1;

class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginServiceTest userLoginServiceTest = new UserLoginServiceTest();
        userLoginServiceTest.testCorrectLogin();
        userLoginServiceTest.testUncorrectedLogin();
        userLoginServiceTest.testAttemptCount();
    }
    void testCorrectLogin() {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        boolean result = service.login(userOne,"user-password");

        if (result) {
            System.out.println("UserLoginService test - Correct user name and password. Successful entry = OK");
        } else {
            System.out.println("UserLoginService test - Correct user name and password. Successful entry = FAIL");
            }
    }
    void testUncorrectedLogin() {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        boolean result = service.login(userOne,"user-password-12345");

        if (!result) {
            System.out.println("UserLoginService test - Correct user name and uncorrected password. Access denied = OK");
        } else {
            System.out.println("UserLoginService test - Correct user name and uncorrected password. Access denied = FAIL");
        }
    }
    void testAttemptCount() {
        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        for (int count = 1; count <= 3; count++) {
            boolean result = service.login(userOne,"user-password-12345");
            if (!result) {
                System.out.println("UserLoginService test - Correct user name and uncorrected password. " +
                        "Number of attempts: " + userOne.getAttemptCount() + " = OK");
            } else {
                System.out.println("serLoginService test - Correct user name and uncorrected password. Number of attempts: = FAIL");
            }
        }
        boolean isBlockedUser = userOne.isUserBlock();
        if (isBlockedUser) {
            System.out.println("UserLoginService test - User block = OK");
        } else {
            System.out.println("UserLoginService test - User block = FAIL");
        }
        userOne.resetAttemptCount();
        if (isBlockedUser) {
            System.out.println("UserLoginService test - User unblock = OK");
        } else {
            System.out.println("UserLoginService test - User unblock = FAIL");
        }
    }
}



