package student_vladimir_filipov.lesson3_hometasks.day_5.task_20;

class Dog {
    private String name;
    private int age;

     public Dog(String name, int age) {
         this.name = name;
         this.age = age;  }

      void voice() {System.out.println("Voice! - " + " Av!");}
      void name() {System.out.println("Dog name is - " + name + ",it's " + age + " year old."+" Happy Birthday to You,Kent!");}
      void age() {System.out.println("It's now " + (age + 1) + " year old");}

     }



