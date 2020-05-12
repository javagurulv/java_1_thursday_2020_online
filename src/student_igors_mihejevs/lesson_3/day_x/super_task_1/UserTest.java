package student_igors_mihejevs.lesson_3.day_x.super_task_1;

class UserTest {

    public static void main(String[] args) {
        test1();
    }

    // numberOfAttempts test
    public static void test1() {
        User user = new User("User-login", "password");
        int counter;
        user.cancelNumberOfAttempts();
        for(counter = 1; counter <= 3; counter++) {
            user.decreaseNumberOfAttempts();
        }
        if(user.getNumberOfAttempts() == 0) {
            System.out.println("Test 1 = OK");
        }
        else {
            System.out.println("Test 1 = FAIL");
        }
    }

}
