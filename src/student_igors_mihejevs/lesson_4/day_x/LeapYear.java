package student_igors_mihejevs.lesson_4.day_x;

public class LeapYear {

    public boolean yearDetect(int number) {

        if (number % 4 == 0) {
            if (number % 100 != 0) {
                return true;
            } else return number % 400 == 0;
        } else return false;
    }

}