package student_aleksey_kodin.lesson4.dayx.supertask2;

class LeapYear {
    boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
