package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_25;

class Circle {

    double radius;

    public Circle(double Radius){
        this.radius = Radius;
    }

    public void calculateArea() {
        System.out.println("Area is = " + (Math.PI*Math.pow(radius,2)));
    }

}
