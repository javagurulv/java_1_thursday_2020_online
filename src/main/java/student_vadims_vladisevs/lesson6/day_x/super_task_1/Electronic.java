package student_vadims_vladisevs.lesson6.day_x.super_task_1;

class Electronic {
    private String electronicType;
    private double electronicPrice;

    public Electronic(String electronicType, double electronicPrice){
        this.electronicPrice = electronicPrice;
        this.electronicType = electronicType;
    }


    public double getElectronicPrice() {
        return electronicPrice;
    }

    public String getElectronicType() {
        return electronicType;
    }
}
