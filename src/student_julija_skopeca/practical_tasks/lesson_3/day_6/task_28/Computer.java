package student_julija_skopeca.practical_tasks.lesson_3.day_6.task_28;

class Computer {

    private String manufacturer;
    private String model;

    public Computer(String computerManufacturer, String computerModel) {
        this.manufacturer = computerManufacturer;
        this.model = computerModel;
    }

    public String getManufacturer() {
       return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }
}
