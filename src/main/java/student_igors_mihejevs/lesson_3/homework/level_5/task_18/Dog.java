package student_igors_mihejevs.lesson_3.homework.level_5.task_18;

class Dog {

    private final String name;

    public Dog(String dogName) {
        this.name = dogName;
    }

    public void voice() {
        int counter;
        for (counter = 1; counter <= 3; counter++) {
            System.out.println(name);
        }
    }

}
