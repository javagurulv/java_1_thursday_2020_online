package student_vadims_vladisevs.lesson3.day_6.task_24;

class PhoneDemo {
    public static void main(String[] args) {
        Phone firstPhone = new Phone("Nokia", false, 500);
        firstPhone.aboutPhone();
        firstPhone.switchOn();
        firstPhone.aboutPhone();
    }
}
