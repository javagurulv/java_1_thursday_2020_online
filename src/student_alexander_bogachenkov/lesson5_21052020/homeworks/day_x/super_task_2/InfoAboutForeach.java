package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_x.super_task_2;

class InfoAboutForeach {

//    For each loop, also known as enhanced loop, is another  way to traverse the array
//    ▸ There is no use of the index or rather the counter variable
//    ▸ Data type declared in the foreach must match the data type of the array that you are iterating
//    ▸ Can access only current element
//    ▸ Significantly reduces amount of code

    public static void main(String[] args) {
        String[] dogBreeds = {"Beagle", "Golden Retriever", "Pug", "Shiba Inu"};
        for (String breed : dogBreeds) {
            System.out.println(breed);
        }
    }
}
