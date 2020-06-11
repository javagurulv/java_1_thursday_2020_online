package student_vadims_vladisevs.lesson3.day_x.super_task_1;

class UserLoginServer {

    public boolean login(User user, String password){

        boolean tempValue = false;

        if (user.getLoginAttemptsCount() > 0){
            if (password.equals(user.getUserPassword())){
                user.resetAttemptsCount();
                System.out.println("Successful entry!");
                tempValue =  true;
            }
            else {
                user.setLoginAttemptsCount(user.getLoginAttemptsCount() - 1);
                System.out.println("Failed login!");
                if (user.getLoginAttemptsCount() == 0){
                    user.setUserBlocked();
                    System.out.println("User is blocked!");
                }
                tempValue =  false;
            }
        }
        else if (user.getLoginAttemptsCount() == 0){
            System.out.println("User is blocked!");
            tempValue = false;
            }
        return tempValue;
        }



    }






