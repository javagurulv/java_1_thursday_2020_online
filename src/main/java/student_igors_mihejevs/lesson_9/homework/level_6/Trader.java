package student_igors_mihejevs.lesson_9.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "{"
                + "fullName = " + this.fullName + ", "
                + "city = " + this.city + ", "
                + "country = " + this.country
                + "}";
    }
}
