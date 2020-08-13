package student_igors_mihejevs.lesson_3.homework.level_6.task_24.Plant;

class Plant {

    private final String species;
    private String name;
    private boolean isWatered;

    public Plant(String species, String name, boolean isWatered) {
        this.species = species;
        this.name = name;
        this.isWatered = isWatered;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getName() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void plantHelp() {
        System.out.println("I'm drying up! Please give me some water!");
    }

    public void plantIsWatered() {
        this.isWatered = true;
        System.out.println("The plant is watered !");
        this.isWatered = false;
    }

}
