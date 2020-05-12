package student_julija_skopeca.practical_tasks.lesson_3.day_3;

 class robotDemo {

    public static void main(String[] args) {

        robot robot1 = new robot("Rider");
        String name1 = robot1.getName();
        robot1.sayHello();
        robot1.sayYourName();

        robot robot2 = new robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
