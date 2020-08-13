package student_diana_miranovica.lesson_9.homeworks.day_6.task_31;

 class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
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

    public String getCountry(){
        return  country;
    }
}
