package student_dmitrijs_visuns.homeworks.lesson_9.level_6;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader (String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
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
        return "TRADER NAME: " + getFullName() + "; "
                + "TRADER CITY: " + getCity() + "; "
                + "TRADER COUNTRY: " + getCountry() + "; ";
    }
}
