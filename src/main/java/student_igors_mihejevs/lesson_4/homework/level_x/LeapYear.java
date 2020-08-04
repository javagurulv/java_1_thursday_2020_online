package student_igors_mihejevs.lesson_4.homework.level_x;

class LeapYear {

    public boolean yearDetect(int number) {

        if (number % 4 == 0) {
            if (number % 100 != 0) {
                return true;
            } else return number % 400 == 0;
        } else return false;
    }

}