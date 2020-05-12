package student_vadims_vladisevs.lesson3.day_x.super_task_1;

import java.util.Scanner;

class UserTest {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Choose test: ");
        System.out.println("[1] Login attempts reset");
        System.out.println("[2] User block");
        System.out.println("Enter test number: ");

        int number = scr.nextInt();
        if (number == 1){
            testAttemptsReset();
        }
        else if (number == 2 ){
            testUserBlock();
        }
    }

    public static void testAttemptsReset(){
        User userOne = new User("user-login", "user-password");
        userOne.setLoginAttemptsCount(1);
        userOne.resetAttemptsCount();
        if (userOne.getLoginAttemptsCount() == 3){
            System.out.println("Test successful!");
        }
        else {
            System.out.println("Test failed!");
        }
        System.out.println("-----------");
        userOne.printUserInfo();
    }

    public static void testUserBlock(){
        User userOne = new User("user-login", "user-password");
        userOne.setUserBlocked();
        if (userOne.getIsUserBlocked()){
            System.out.println("Test successful!");
        }
        else {
            System.out.println("Test failed!");
        }
        System.out.println("-----------");
        userOne.printUserInfo();
    }


}
