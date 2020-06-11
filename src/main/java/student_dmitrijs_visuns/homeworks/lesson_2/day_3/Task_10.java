package student_dmitrijs_visuns.homeworks.lesson_2.day_3;
// Write a Java program to print the area and perimeter of a circle.

class Task_10 {

    public static void main(String[] args) {

        double radius = 7.5;
        double perimeter = Math.PI * 2 * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Если радиус круга равен 7.5, то:");
        System.out.println("Периметр круга равен " + perimeter);
        System.out.println("Площадь круга равна " + area);
    }

}
