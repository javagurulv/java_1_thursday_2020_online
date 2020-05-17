package student_vladimir_filipov.lesson3_hometasks.day_6;

class ComputerDemo {

    public static void main(String[] args) {

        Computer dell = new Computer("Dell", "Dell 32570");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
    

