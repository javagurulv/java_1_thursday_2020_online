package student_julija_skopeca.practical_tasks.lesson_9.level_6;

class Trader {

    private String fullName;
    private String city;
    private String state;

    public Trader(String fullName, String city, String state) {
        this.fullName = fullName;
        this.city = city;
        this.state = state;
    }

    public String getFullName() {return fullName;}
    public String getCity() {return city;}
    public String getState() {return state;}

    @Override
    public String toString() {
        return "Trader - " + fullName +
                ". City - " + city +
                ". State - " + state + ". ";
    }

}
