package student_vadim_sokolenko.Lesson3.lesson3task20;

class Dog {

    private String name;
    private int age;


    public Dog(String dogName, int dogAge){
        this.name = dogName;
        this.age = dogAge;}

    public void voice(){
        System.out.println("Dogs name is" + this.name);
        System.out.println("Dogs age is" + this.age);}

        public void happyBirthday() {
            age++;
        }
}
