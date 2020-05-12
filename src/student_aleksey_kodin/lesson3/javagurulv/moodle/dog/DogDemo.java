package student_aleksey_kodin.lesson3.javagurulv.moodle.dog;

class DogDemo {
        public static void main(String[] args) {

            Dog smallDog = new Dog(2,"Black","Fet");

            System.out.print("The dog " + smallDog.getName());
            smallDog.voice();

            System.out.println();
            System.out.print("The dog " + smallDog.getName());
            smallDog.sleep();

            System.out.println();
            System.out.print("The dog " + smallDog.getName());
            smallDog.eat();

            System.out.println();
            System.out.print("The dog " + smallDog.getName() + " is " + smallDog.getColor() + ".");

            System.out.println();
            System.out.print("The dog " + smallDog.getName() +" age is " + smallDog.getAge() + " years.");

            System.out.println();
            smallDog.setAge(3);
            System.out.print("But next year age will be " + smallDog.getAge() + " years.");
        }
}
