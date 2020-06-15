package student_aleksey_kodin.lesson8.level3.task_13;

class Demo {
    public static void main(String[] args) {
        House house = new House(2);
        ApartmentHouse apartmentHouse = new ApartmentHouse(9);

        house.toEntry();
        System.out.println("Private house is " + house.getStageCount() + " stages");

        apartmentHouse.toEntry();
        System.out.println("Apartment house is " + apartmentHouse.getStageCount() + " stages");
    }
}
