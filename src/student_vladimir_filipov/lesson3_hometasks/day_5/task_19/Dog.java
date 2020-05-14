package student_vladimir_filipov.lesson3_hometasks.day_5.task_19;

class Dog {

    private final String name;
    private final int age;

    public Dog(String name, int age ) {this.name = name; this.age = age;}

    void voice() {System.out.println("Voice!");}
    void name() {System.out.println("Dog name is - " + name + " it's " + age + " year old");}

}
