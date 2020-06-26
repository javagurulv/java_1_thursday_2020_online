package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_6.task_33;

class Trader {

    private String fullName;
    private String country;
    private String city;

    public Trader(String fullName, String country, String city) {
        this.fullName = fullName;
        this.country = country;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Trader = { fullName = " + fullName
                + "; country = " + country
                + "; city = " + city + "; }";
    }
}