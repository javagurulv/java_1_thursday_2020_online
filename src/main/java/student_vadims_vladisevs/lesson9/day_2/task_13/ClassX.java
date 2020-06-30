package student_vadims_vladisevs.lesson9.day_2.task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {

    public ClassY() {
        super(2);
        System.out.println(2);
    }
}