package student_dmitrijs_visuns.homeworks.lesson_3.day_5.task_22;

class Dog {

    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog (String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice() {
        System.out.println(dogName + ", " + dogAge + " years, " + dogColor);
    }

    public void changeColor (String newColor) {
        this.dogColor = newColor;
        System.out.println("MAGIC! Dog color change trick");
    }

}
