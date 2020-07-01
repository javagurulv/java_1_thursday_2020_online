package student_dmitrijs_visuns.homeworks.lesson_9.level_4;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader (String fullName, String city, String country) {
        this.fullName = fullName;
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
