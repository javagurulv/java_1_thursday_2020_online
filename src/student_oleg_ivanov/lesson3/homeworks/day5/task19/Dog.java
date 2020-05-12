package student_oleg_ivanov.lesson3.homeworks.day5.task19;

class Dog {
    private int age;
    private String name;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public void voise() {
        System.out.println("The dog name is " + name);
        System.out.println("He is " + age + " years old");
    }
}
