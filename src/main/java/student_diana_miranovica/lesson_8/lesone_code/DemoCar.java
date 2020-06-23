package student_diana_miranovica.lesson_8.lesone_code;

public class DemoCar {

     public static void main(String[] args) {

         ElectricCar electricCar = new ElectricCar("Tesla3", 100);
         PetrolCar petrolCar = new PetrolCar("Ferrary Monza");
         DieselCar dieselCar = new DieselCar("VW");

         Car car1 = electricCar;
         Car car2 = petrolCar;
         Car car3 = dieselCar;



         car1.start();
         car2.start();
         car3.start();


         /*Car car = new Car("Nissan");
         car.start();
         car.stop();*/
     }
}
