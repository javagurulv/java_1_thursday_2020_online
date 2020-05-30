package student_arturs_ragausks.lesson_3.homeworks.day5.Task20;

 class Dog {

     private String name;

     private int age;

     public Dog(String dogName, int dogAge) {
         this.name = dogName;
         this.age = dogAge;
     }

     public void voice(){
         System.out.println("Happy Birthday to me! " );
         System.out.println("I'm " + (this.age + 1) + " years old now ");


     }
}
