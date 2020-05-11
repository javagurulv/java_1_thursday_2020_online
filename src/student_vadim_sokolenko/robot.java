package student_vadim_sokolenko;

public class robot {

    private String name;

        public robot(String robotName) {
        this.name = robotName;
        }

    public robot() {

    }

    public void sayHello() { System.out.println("Hello!"); }
    public void sayName() {
        System.out.println("My name is " + this.name);
    }




}
