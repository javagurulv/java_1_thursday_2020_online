package student_igors_mihejevs.lesson_3.homework.level_x.super_task_1;

class UserTest {

    public static void main(String[] args) {
        userClassTest();
    }

    // testing methods: cancelNumberOfAttempts(), decreaseNumberOfAttempts() and userIsBlocked().
    public static void userClassTest() {
        User user = new User("User-login", "password");
        int counter;

        user.cancelNumberOfAttempts();
        for(counter = 1; counter <= 3; counter++) {
            user.decreaseNumberOfAttempts();
            user.userIsBlocked();
        }
        if(user.getNumberOfAttempts() == 0) {
            System.out.println("Test of cancelNumberOfAttempts() and decreaseNumberOfAttempts() = OK");
            if (user.getIsBlocked()) {
                System.out.println("Test of userIsBlocked() = OK");
            } else {
                System.out.println("Test of userIsBlocked() = FAIL");
            }
        }
        else {
            System.out.println("Test of cancelNumberOfAttempts() and decreaseNumberOfAttempts() = FAIL");
        }
    }

}
