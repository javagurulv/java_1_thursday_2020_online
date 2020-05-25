package student_vadims_vladisevs.lesson6.day_x.super_task_1;

class Property {
    private String address;
    private double cadastralPrice;
    private boolean isHouse;
    private boolean isFlat;

    public Property(String adress, double cadastralPrice, boolean isHouse){
        this.address = adress;
        this.cadastralPrice = cadastralPrice;

        if (isHouse){
            this.isHouse = true;
        } else {
            this.isFlat = true;
        }
    }

    public double getCadastralPrice() {
        return cadastralPrice;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlat() {
        return isFlat;
    }

    public boolean isHouse() {
        return isHouse;
    }
}
