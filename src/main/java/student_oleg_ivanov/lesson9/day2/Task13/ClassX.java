package student_oleg_ivanov.lesson9.day2.Task13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(5);
        System.out.println(2);
    }
}
