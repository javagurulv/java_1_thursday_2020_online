package student_edgars_lukjanskis.lession_3.homeworks.day_5.Task_20;

class Dog {
    private final String name;
    private int age;


    public Dog(String dogName,
                              int dogAge) {

        this.name = dogName;
        this.age = dogAge;
    }

    void voice() {
        System.out.println("Dog name " + this.name);
        System.out.println("Dog age " + this.age);
    }
        public void happyBirthday() {
        age++;
        }

}
