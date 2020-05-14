package student_vladimir_filipov.lesson3_hometasks.day_5.task_21;

class Dog {

    private String colour;
    private String name;
    private int age;

    public Dog(String colour, String name, int age) {
        this.colour = colour;
        this.name  = name;
        this.age = age;
    }

     void colour() {System.out.println("Grey");}
     void voice () {System.out.println("Voice! - " + "Av!");}
     void name () {System.out.println("Dog name's -" + name + ", It's " + age + " old year" + " ,colour is Grey");}

}



