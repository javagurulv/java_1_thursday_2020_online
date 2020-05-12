package student_oleg_ivanov.lesson3.homeworks.day5.task21;

class Dog {
    private String name;
    private int age;
    private String colour;

    public Dog(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public void voice(){
        System.out.println("Dog name is " + name);
        System.out.println(name + " is " + age + " years old ");
        System.out.println("He's colour is " + colour);

    }

}
