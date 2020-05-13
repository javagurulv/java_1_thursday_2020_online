package student_dmitrijs_visuns.homeworks.lesson_3.day_5.task_21;

class Dog {

    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog (String dogName, String dogColor, int dogAge) {
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public void voice() {
            System.out.println(dogName + ", " + dogAge + " years, " + dogColor);
        }

}
