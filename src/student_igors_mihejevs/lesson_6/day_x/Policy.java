package student_igors_mihejevs.lesson_6.day_x;

class Policy {

    private String nameOfObject;
    private double priceOfObject;
    private boolean isMovableProperty;
    private boolean isFire;

    @Override
    public String toString() {
        return "Policy{" +
                "nameOfObject='" + nameOfObject + '\'' +
                ", priceOfObject=" + priceOfObject +
                ", isMovableProperty=" + isMovableProperty +
                ", isFire=" + isFire +
                '}';
    }

    public void setNameOfObject(String nameOfObject) {
        this.nameOfObject = nameOfObject;
    }

    public void setPriceOfObject(double priceOfObject) {
        this.priceOfObject = priceOfObject;
    }

    public void setMovableProperty(boolean movableProperty) {
        isMovableProperty = movableProperty;
    }

    public void setFire(boolean fire) {
        isFire = fire;
    }

    public String getNameOfObject() {
        return nameOfObject;
    }

    public double getPriceOfObject() {
        return priceOfObject;
    }

    public boolean isFire() {
        return isFire;
    }
}