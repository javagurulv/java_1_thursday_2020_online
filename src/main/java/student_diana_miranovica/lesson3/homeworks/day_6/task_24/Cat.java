package student_diana_miranovica.lesson3.homeworks.day_6.task_24;

class Cat {
    private final String name;
    private final int age;
    private final String color;

    public Cat(String catName, int catAge, String catColor){
        this.name = catName;
        this.age = catAge;
        this.color = catColor;
    }
    public void voice() {
        System.out.println("Cat name is " + this.name);
        System.out.println("Cat age is " + this.age + " years");
        System.out.println("Cat color is " + this.color);
    }
}
