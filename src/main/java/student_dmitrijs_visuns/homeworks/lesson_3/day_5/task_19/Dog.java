package student_dmitrijs_visuns.homeworks.lesson_3.day_5.task_19;

class Dog {

    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voice() {
        System.out.println(dogName + ", " + dogAge + " years");
    }


}
