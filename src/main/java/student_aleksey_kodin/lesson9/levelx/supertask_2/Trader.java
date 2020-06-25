package student_aleksey_kodin.lesson9.levelx.supertask_2;

public class Trader {

    private final String fullName;
    private final String city;
    private final String phoneNumber;

    private Trader(Builder builder) {
        this.fullName = builder.fullName;
        this.city = builder.city;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + this.fullName + '\'' +
                ", city='" + this.city + '\'' +
                ", phoneNumber='" + this.phoneNumber + '\'' +
                '}';
    }

    public static class Builder {
        private final String fullName;
        private String city;
        private String phoneNumber;


        public Builder(String fullName) {
            this.fullName = fullName;
        }

        public Builder addCity(String city) {
            this.city = city;
            return this;
        }

        public Builder addPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Trader build() {
            return new Trader(this);
        }
    }
}

