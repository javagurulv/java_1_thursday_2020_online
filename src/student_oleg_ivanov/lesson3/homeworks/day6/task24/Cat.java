package student_oleg_ivanov.lesson3.homeworks.day6.task24;

public class Cat {
    private final String name;
    private boolean isAngry;
    private boolean wantPlay;

    public Cat(String name, boolean isAngry, boolean wantPlay) {
        this.name = name;
        this.isAngry = isAngry;
        this.wantPlay = wantPlay;
    }
    public void aboutCat () {
        System.out.println("Cat name is " + name);
        System.out.println("She want "+ isAngry);
        System.out.println("She is angry " + wantPlay);
    }

    public void work() {
        isAngry = false;
        wantPlay = true;
    }


}
