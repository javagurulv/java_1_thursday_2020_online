package student_vadims_vladisevs.lesson9.day_x.super_task_2;

class Trader {

    private String fullName;
    private String city;
    private String country;

    private Trader(){

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

    public static Builder newBuilder(){
        return new Trader().new Builder();
    }

    class Builder {

        private Builder(){

        }

        public Builder setFullName(String fullName){
            Trader.this.fullName = fullName;
            return this;
        }
        public Builder setCity(String city){
            Trader.this.city = city;
            return this;
        }
        public Builder setCountry(String country){
            Trader.this.country = country;
            return this;
        }

        public Trader build(){
            return Trader.this;
        }

    }
}