package student_vadims_vladisevs.lesson4.homework.day_x.super_task_2;

class LeapYear {

    public boolean isLeapYear(int year){
        if ((year % 4 == 0) && (year % 100 > 0)){
            return true;
        }
        else if ((year % 100 == 0) && (year % 400 == 0)){
            return true;
        }
        else if (year % 100 == 0){
            return false;
        }
        else {
            return false;
        }
    }
}
