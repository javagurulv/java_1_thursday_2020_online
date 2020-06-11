package student_oleg_ivanov.lesson3.homeworks.day5.task22;

class Dog {
    private String name;
    private int age;
    private String firstColour;

    public Dog(String name, int age, String firstColour) {
        this.name = name;
        this.age = age;
        this.firstColour = firstColour;
    }
    public void voice() {
        System.out.println(name + " is " + age + " years old");
        System.out.println("Today He`s colour is " + firstColour);
    }

    public void changeColor(String newColor) {
        this.firstColour = newColor;
        System.out.println("Tomorrow " + name + " colour will be " + firstColour);

    }
}
