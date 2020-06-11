package student_aleksey_kodin.lesson3.day6.task_25;

class CircleDemo {

    public static void main(String[] args) {

        Circle Circle = new Circle(5.05);
        System.out.println("Radius - " + Circle.getRadius());
        System.out.println("Area - " + Circle.getCircleArea());

        Circle.setRadius(10.15);
        System.out.println("Radius - " + Circle.getRadius());
        System.out.println("Area - " + Circle.getCircleArea());

        Circle.setRadius(15.25);
        System.out.println("Radius - " + Circle.getRadius());
        System.out.println("Area - " + Circle.getCircleArea());
    }
}
