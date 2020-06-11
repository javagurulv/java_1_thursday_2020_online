package student_diana_miranovica.lesson_8.lesone_code;

 public abstract class  Car extends Object {


     private String model;

     public Car(String model) {
         super();
         this.model = model;
     }

     public abstract void start();

     public  abstract void  stop();

}
