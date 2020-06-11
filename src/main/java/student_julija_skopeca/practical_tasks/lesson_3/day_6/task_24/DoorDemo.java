package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_24;

class DoorDemo {

    public static void main(String[] args) {

        Door door1 = new Door("Wood",  true);
        String material1 = door1.getDoorMaterial();

        System.out.println("The material of door 1 is " + material1);

        door1.isOpened();

        Door door2 = new Door("Iron",  false);
        String material2 = door2.getDoorMaterial();

        System.out.println("The material of door 2 is " + material2);

        door2.isClosed();

    }
}
