package student_diana_miranovica.lesson3.homeworks.day_2;

 class Motorcycle {
    String model;
    int maxSpeed;

    public static void main(String[] args) {

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.model = "Lombargini";
        motorcycle1.maxSpeed = 300;

        Motorcycle motorcycle2 = new Motorcycle();
        motorcycle2.model = "Lombargini";
        motorcycle2.maxSpeed = 300;

        System.out.println(motorcycle1 == motorcycle2);
    }
}
