package student_vadim_sokolenko.lesson3task21;

class Dog {

    private String name;
    private int age;
    private String color;

    public Dog (String dogName, int dogAge, String dogColor){

        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;}


    public void voice(){
        System.out.println("Dogs name is " + this.name);
        System.out.println("Dogs age is " + this.age + " years old");
        System.out.println("Dogs color is " + this.color);
        }


}
