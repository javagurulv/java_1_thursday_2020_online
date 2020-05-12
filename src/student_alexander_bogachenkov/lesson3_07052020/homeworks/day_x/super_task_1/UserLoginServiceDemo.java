package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_x.super_task_1;

class UserLoginServiceDemo {

    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();

        User userOne = new User("user-login", "user-password");
        //Should return false
        System.out.println(service.login(userOne, "user-password-12345"));
        //Should return true
        System.out.println(service.login(userOne, "user-password"));
    }
}
