package student_aleksey_kodin.lesson3.day5.task_18;

class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    void voice() {
        for(byte count = 0; count <= 2; count++) {
            System.out.print(name + " ");
        }
    }

}
