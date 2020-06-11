package student_arturs_ragausks.lesson_3.homeworks.day5.Task21;

 class Dog {

     private String name;

     private int age;

     private String color;

     public Dog(String dogName, int dogAge, String dogColor) {
         this.name = dogName;
         this.age = dogAge;
         this.color = dogColor;
     }

     public void voice(){
         System.out.println("Me " + this.name);
         System.out.println("I'm " + (this.age) + " years old ");
         System.out.println("Me color is " + this.color);


     }




}
