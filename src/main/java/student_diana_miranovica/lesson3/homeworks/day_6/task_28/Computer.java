package student_diana_miranovica.lesson3.homeworks.day_6.task_28;

 class Computer {
    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

     public String getManufacturer() {
         return manufacturer;
     }

     public String getModel() {
         return model;
     }
 }

 class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}
