package student_julija_skopeca.practical_tasks.lesson_9.level_2.task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(1);
        System.out.println(2);
    }
}
