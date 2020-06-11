package student_arturs_ragausks.lesson_3.homeworks.day6.Task24;

 class Parrot {
     private String color;

     private String breed;

     private int age;

     private String name;

     public Parrot(String parrotColor, String parrotBreed, int parrotAge, String parrotName){
         this.color = parrotColor;
         this.breed = parrotBreed;
         this.age = parrotAge;
         this.name = parrotName;
     }
    public void voice(){
         System.out.println("Parrot is " + color + " colored");
         System.out.println("This noble parrots breed is called " + breed);
         System.out.println("This bird is " + age + " years old");
         System.out.println("Parrots name is " + name);
    }
}
