package student_aleksey_kodin.lesson8.level3.task_13;

class House extends Building {

    House(int stage) {
        super(stage);
    }
    @Override
    void toEntry() {
        System.out.println("We can entry to private house");
    }
}
class ApartmentHouse extends Building {

    ApartmentHouse(int stage) {
        super(stage);
    }

    @Override
    void toEntry() {
        System.out.println("We can entry to apartment house");
    }
}
