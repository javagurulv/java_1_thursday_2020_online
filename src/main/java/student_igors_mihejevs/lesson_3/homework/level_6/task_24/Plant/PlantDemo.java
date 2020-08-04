package student_igors_mihejevs.lesson_3.homework.level_6.task_24.Plant;

class PlantDemo {

    public static void main(String[] args) {
        Plant myPlant = new Plant("tree", "oak", false);

        String plantSpecies = myPlant.getSpecies();
        String plantName = myPlant.getName();

        System.out.println("One of my plant is " + plantSpecies + " and it's an " + plantName);

        // Plant is not in good condition
        myPlant.plantHelp();

        myPlant.plantIsWatered();
    }
}
