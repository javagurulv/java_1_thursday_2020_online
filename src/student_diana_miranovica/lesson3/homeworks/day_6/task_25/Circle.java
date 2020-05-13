package student_diana_miranovica.lesson3.homeworks.day_6.task_25;

class Circle {
    private double radius;

     Circle( double radius){
        this.radius = radius;

    }

    public void setRadius (double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;

    }
    public double calculateAreaGet(){
        return calculateArea();

    }
    private double calculateArea(){
        return Math.PI * radius * radius;

    }
}

