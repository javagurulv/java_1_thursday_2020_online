package student_aleksey_kodin.lesson3.day5.task_22;

class DogDemo {
    public static void main(String[] args) {

        Dog smallDog = new Dog("Friend", 2,"Black");

        smallDog.voice();
        smallDog.changeColor("White");
        smallDog.voice();
    }
}
