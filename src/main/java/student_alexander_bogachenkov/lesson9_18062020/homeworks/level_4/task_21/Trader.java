package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_4.task_21;

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
}