package student_vadims_vladisevs.lesson9.day_6;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city){
        this.fullName = fullName;
        this.city = city;
    }

    public Trader(String fullName, String country, String city){
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
        return  "Trader full Name ='" + fullName + '\'' +
                ", city = '" + city + '\'' +
                ", country = '" + country + '\'';
    }
}