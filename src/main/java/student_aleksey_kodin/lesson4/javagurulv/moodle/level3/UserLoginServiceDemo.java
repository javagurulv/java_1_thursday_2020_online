package student_aleksey_kodin.lesson4.javagurulv.moodle.level3;

import java.util.Scanner;

class UserLoginServiceDemo {

    public static void main(String[] args) {
        String userPassword;

        UserLoginService service = new UserLoginService();

        Scanner input = new Scanner(System.in);
        System.out.println("Create new user");
        System.out.println("Enter Your login:");
        String userName = input.next();
        System.out.println("Enter Your password:");
        userPassword = input.next();

        User userOne = new User(userName,userPassword);
        System.out.println("Your account created.");

        while(true) {
            if (userOne.getAttemptCount() != 0) {
                System.out.println("Please enter Your password or 'exit' for exit");
            }
                userPassword = input.next();
                if (userPassword.equals("exit")) {
                    input.close();
                    System.exit(0);
                }
                if (service.login(userOne,userPassword)) {
                    System.out.println("You login successful");
                    input.close();
                    System.exit(0);
                } else if (userOne.getAttemptCount() == 0) {
                        System.out.println("Your account blocked, please enter 'unblock'");
                            userPassword = input.next();
                            if (userPassword.equals("unblock")) {
                                userOne.resetAttemptCount();
                            }
                } else {
                    System.out.println("You enter wrong password.You have only " +
                            userOne.getAttemptCount() + " attempt(s)");
                }
        }
    }
}
