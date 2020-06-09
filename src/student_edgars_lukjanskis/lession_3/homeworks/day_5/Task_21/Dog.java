package student_edgars_lukjanskis.lession_3.homeworks.day_5.Task_21;

class Dog {

    private final String name;
    private final int age;
    private final String color;

    public Dog(String dogName, int dogAge, String dogColor) {

        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

        public void voice(){

        System.out.println("Dog name " + this.name);
        System.out.println("Dog age " + this.age);
        System.out.println("Dog color " + this.color);



    }
}
