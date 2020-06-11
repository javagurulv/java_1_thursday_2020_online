package student_oleg_ivanov.lesson3.homeworks.day5.task20;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void voice(){
        System.out.println("Dog name is " + name);
        System.out.println("He is " + age + " years old");
    }
    public void happyBirthday(){
        this.age = age + 1;
        System.out.println("HappyBirthday!!!");
        System.out.println(name + " age is " + age + " years");
    }

}
