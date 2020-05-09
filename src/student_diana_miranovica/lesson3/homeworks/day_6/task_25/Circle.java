package student_diana_miranovica.lesson3.homeworks.day_6.task_25;

public class Circle {
    private double radius;
    private double area;

    public Circle( double radius){
        this.radius = radius;
        this.area = radius * radius * Math.PI;

    }



    public void voice(){
        System.out.println("Circle area : " + radius + " * " + radius + " * " + Math.PI + " = " +  area);
    }





}

