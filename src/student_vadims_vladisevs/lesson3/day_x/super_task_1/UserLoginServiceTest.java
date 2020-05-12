package student_vadims_vladisevs.lesson3.day_x.super_task_1;

import java.util.Scanner;

class UserLoginServiceTest {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Choose test: ");
        System.out.println("[1] Successful Login from first attempt");
        System.out.println("[2] Failed login from three attempts");
        System.out.println("[3] Two failed attempts and one successful attempt");
        System.out.println("Enter test number: ");
        int number = scr.nextInt();
        if (number == 1){
            testSuccessfulLogin();
        }
        else if (number == 2 ) {
            testFailedLogin();
        }
        else if (number == 3) {
            testTwoFailedAttemptsOneSuccessful();
        }
    }

    public static void testSuccessfulLogin(){

        UserLoginServer service = new UserLoginServer();
        User userOne = new User("user-login", "user-password");

        if (service.login(userOne, "user-password")) {
            System.out.println("Test complete successful");
        }
        else {
            System.out.println("Test failed");
        }
    }

    public static void testFailedLogin(){
        UserLoginServer service = new UserLoginServer();
        User userOne = new User("user-login", "user-password");

        for (int i = 0; i < 4; i++) {
            if (!service.login(userOne, "password")) {
                System.out.println("OK");
            } else {
                System.out.println("error");
            }
        }

        userOne.printUserInfo();
        System.out.println("Test complete successful");

    }

    public static void testTwoFailedAttemptsOneSuccessful(){
        UserLoginServer service = new UserLoginServer();
        User userOne = new User("user-login", "user-password");

        for (int i = 0; i < 2; i++) {
            if (!service.login(userOne, "password")) {
                System.out.println("OK");
            } else {
                System.out.println("error");
            }
        }
        System.out.println("---------------");
        userOne.printUserInfo();
        System.out.println("---------------");

        if (service.login(userOne, "user-password")) {
            System.out.println("Test complete successful");
        }
        else {
            System.out.println("Test failed");
        }
        System.out.println("---------------");
        userOne.printUserInfo();
    }



}
