package student_oleg_ivanov.lesson3.homeworks.day6;

class Cat {
    private String name;
    private boolean isAngry;
    private boolean wantPlay;

    public Cat(String name, boolean isAngry, boolean wantPlay) {
        this.name = name;
        this.isAngry = isAngry;
        this.wantPlay = wantPlay;
    }
    public void aboutCat () {
        System.out.println("Cat name is: " + name);
        System.out.println("She is angry? " + isAngry);
        System.out.println("She want play? " + wantPlay);
    }
    public void aboutTiredCat () {
        System.out.println("Cat name is: " + name);
        System.out.println("She is angry? " + isAngry);
        System.out.println("She doesn't want play: " + wantPlay);
    }

    public void playCat() {isAngry = true;}





}
